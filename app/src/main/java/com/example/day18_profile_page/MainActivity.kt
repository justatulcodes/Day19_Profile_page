package com.example.day18_profile_page

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsControllerCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.day18_profile_page.databinding.ActivityMainBinding

//https://i.pinimg.com/564x/b8/b1/48/b8b14866f44c43423559453d9744aa7d.jpg

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val sampleData = sampleData
        val profile = sampleData.random()
        setUpProfile(binding, profile)

        gestureSetup(binding)

        binding.btnExpandCollapse.setOnClickListener{
            // If the CardView is already expanded, set its visibility
            // to gone and change the expand less icon to expand more.
            if (binding.clHiddenPortion.visibility == View.VISIBLE) {
                // The transition of the hiddenView is carried out by the TransitionManager class.
                // Here we use an object of the AutoTransition Class to create a default transition
                TransitionManager.beginDelayedTransition(binding.profileCard, AutoTransition())
                binding.clHiddenPortion.visibility = View.GONE
                binding.btnExpandCollapse.setImageResource(R.drawable.expand_more)
            } else {
                TransitionManager.beginDelayedTransition(binding.profileCard, AutoTransition())
                binding.clHiddenPortion.visibility = View.VISIBLE
                binding.btnExpandCollapse.setImageResource(R.drawable.expand_less)
            }
        }

    }



    private fun setUpProfile(binding: ActivityMainBinding, profile: SampleData) {

        setStatusBarColorAndAppearance("#000000", true)

        binding.ivProfilePicture.setImageResource(profile.profilePicId)
        binding.tvFollowersCount.text = profile.followers.toString()
        binding.tvFollowingCount.text = profile.following.toString()
        binding.tvFirstName.text = profile.firstName
        binding.tvLastName.text = profile.lastName
        binding.tvPostCount.text = profile.postsCount.toString()

        val adapter = PostAdapter(profile.postsList)
        adapter.setOnClickListener(object : PostAdapter.OnClickListener{
            override fun onClick(imageId: Int) {
                binding.ivProfilePicture.setImageResource(imageId)
            }
        })

        binding.rvProfilePosts.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL, false)
        binding.rvProfilePosts.adapter = adapter


    }

    @SuppressLint("ClickableViewAccessibility")
    private fun gestureSetup(binding: ActivityMainBinding) {
        binding.root.setOnTouchListener(@SuppressLint("ClickableViewAccessibility")
        object : OnSwipeTouchListener(this@MainActivity){
            override fun onSwipeRight(): Boolean {
                val profile = sampleData.random()
                setUpProfile(binding, profile)
                return true
            }

            override fun onSwipeLeft(): Boolean {
                val profile = sampleData.random()
                setUpProfile(binding, profile)
                return true
            }

        })
    }

    private fun getScreenHeight() : Int {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val windowMetrics = windowManager.currentWindowMetrics
            val rect = windowMetrics.bounds
            rect.bottom
        } else {
            resources.displayMetrics.heightPixels
        }
    }

    fun Activity.setStatusBarColorAndAppearance(statusBarColor: String, isLight: Boolean ) {
        try {
            window.statusBarColor = (Color.parseColor(statusBarColor))// Or we can use from resource color:  ContextCompat.getColor(mContext, R.color.colorPrimary)
            WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = isLight
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun getMostProminentColor(context: Context, imageResId: Int): String {
        // Load the image from the drawable resource
        val bitmap: Bitmap = BitmapFactory.decodeResource(context.resources, imageResId)

        // Scale down the bitmap for efficiency
        val scaledBitmap: Bitmap = Bitmap.createScaledBitmap(bitmap, 1, 1, false)

        // Extract the pixel color at (0, 0)
        val pixelColor: Int = scaledBitmap.getPixel(0, 0)

        // Convert the color to hexadecimal format
        val hexColor: String = String.format("#%06X", 0xFFFFFF and pixelColor)

        // Return the most prominent color in hexadecimal format
        return hexColor
    }
}