package com.example.day18_profile_page

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.day18_profile_page.databinding.PostItemviewBinding

class PostAdapter(private val postsList: List<Int>) : RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    private var onClickListener: OnClickListener? = null

    class ViewHolder(binding: PostItemviewBinding) : RecyclerView.ViewHolder(binding.root) {
        val ivPost = binding.ivPostImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(PostItemviewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun getItemCount(): Int {
        return postsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageId = postsList[position]
        holder.ivPost.setImageResource(imageId)

        holder.ivPost.setOnClickListener {
            if(onClickListener != null){
                onClickListener?.onClick(imageId)
            }
        }
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    interface OnClickListener{
        fun onClick(imageId: Int)
    }


}