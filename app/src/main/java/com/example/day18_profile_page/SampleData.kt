package com.example.day18_profile_page

class SampleData (
    val firstName: String,
    val lastName: String,
    val postsCount: Int,
    val following: Int,
    val followers: Int,
    val profilePicId: Int,
    val postsList: List<Int>
)

val sampleData = listOf(
    SampleData(
        firstName = "Jane",
        lastName = "Foster",
        postsCount = 56,
        following = 3,
        followers = 3445,
        profilePicId = R.drawable.bg1,
        postsList = listOf(
            R.drawable.bg1, R.drawable.bg6, R.drawable.bg12, R.drawable.bg8, R.drawable.bg10,
            R.drawable.bg5, R.drawable.bg4, R.drawable.bg15, R.drawable.bg7, R.drawable.bg13,
            R.drawable.bg2, R.drawable.bg3, R.drawable.bg14, R.drawable.bg9, R.drawable.bg11
        )
    ),
    SampleData(
        firstName = "John",
        lastName = "Doe",
        postsCount = 32,
        following = 15,
        followers = 1078,
        profilePicId = R.drawable.bg2,
        postsList = listOf(
            R.drawable.bg2, R.drawable.bg10, R.drawable.bg3, R.drawable.bg5, R.drawable.bg9,
            R.drawable.bg1, R.drawable.bg14, R.drawable.bg4, R.drawable.bg6, R.drawable.bg8,
            R.drawable.bg11, R.drawable.bg7, R.drawable.bg12, R.drawable.bg15, R.drawable.bg13
        )
    ),
    SampleData(
        firstName = "Sarah",
        lastName = "Johnson",
        postsCount = 89,
        following = 23,
        followers = 5672,
        profilePicId = R.drawable.bg3,
        postsList = listOf(
            R.drawable.bg3, R.drawable.bg9, R.drawable.bg2, R.drawable.bg4, R.drawable.bg7,
            R.drawable.bg1, R.drawable.bg10, R.drawable.bg5, R.drawable.bg11, R.drawable.bg6,
            R.drawable.bg8, R.drawable.bg12, R.drawable.bg14, R.drawable.bg15, R.drawable.bg13
        )
    ),
    SampleData(
        firstName = "Michael",
        lastName = "Smith",
        postsCount = 107,
        following = 78,
        followers = 7890,
        profilePicId = R.drawable.bg4,
        postsList = listOf(
            R.drawable.bg4, R.drawable.bg2, R.drawable.bg13, R.drawable.bg6, R.drawable.bg14,
            R.drawable.bg1, R.drawable.bg9, R.drawable.bg8, R.drawable.bg3, R.drawable.bg5,
            R.drawable.bg10, R.drawable.bg7, R.drawable.bg11, R.drawable.bg12, R.drawable.bg15
        )
    ),
    SampleData(
        firstName = "Emily",
        lastName = "Brown",
        postsCount = 45,
        following = 9,
        followers = 2345,
        profilePicId = R.drawable.bg5,
        postsList = listOf(
            R.drawable.bg5, R.drawable.bg3, R.drawable.bg9, R.drawable.bg12, R.drawable.bg6,
            R.drawable.bg1, R.drawable.bg10, R.drawable.bg14, R.drawable.bg8, R.drawable.bg11,
            R.drawable.bg4, R.drawable.bg7, R.drawable.bg15, R.drawable.bg2, R.drawable.bg13
        )
    ),
    SampleData(
        firstName = "William",
        lastName = "Anderson",
        postsCount = 76,
        following = 31,
        followers = 4567,
        profilePicId = R.drawable.bg6,
        postsList = listOf(
            R.drawable.bg6, R.drawable.bg11, R.drawable.bg4, R.drawable.bg8, R.drawable.bg13,
            R.drawable.bg1, R.drawable.bg5, R.drawable.bg12, R.drawable.bg3, R.drawable.bg9,
            R.drawable.bg2, R.drawable.bg7, R.drawable.bg10, R.drawable.bg14, R.drawable.bg15
        )
    ),
    SampleData(
        firstName = "Olivia",
        lastName = "Miller",
        postsCount = 67,
        following = 18,
        followers = 3456,
        profilePicId = R.drawable.bg7,
        postsList = listOf(
            R.drawable.bg7, R.drawable.bg1, R.drawable.bg3, R.drawable.bg6, R.drawable.bg9,
            R.drawable.bg12, R.drawable.bg2, R.drawable.bg5, R.drawable.bg8, R.drawable.bg11,
            R.drawable.bg10, R.drawable.bg4, R.drawable.bg14, R.drawable.bg13, R.drawable.bg15
        )
    ),
    SampleData(
        firstName = "James",
        lastName = "Wilson",
        postsCount = 98,
        following = 40,
        followers = 6789,
        profilePicId = R.drawable.bg8,
        postsList = listOf(
            R.drawable.bg8, R.drawable.bg12, R.drawable.bg9, R.drawable.bg2, R.drawable.bg15,
            R.drawable.bg1, R.drawable.bg5, R.drawable.bg6, R.drawable.bg10, R.drawable.bg11,
            R.drawable.bg4, R.drawable.bg7, R.drawable.bg3, R.drawable.bg14, R.drawable.bg13
        )
    ),
    SampleData(
        firstName = "Sophia",
        lastName = "Jones",
        postsCount = 25,
        following = 7,
        followers = 1234,
        profilePicId = R.drawable.bg9,
        postsList = listOf(
            R.drawable.bg9, R.drawable.bg6, R.drawable.bg11, R.drawable.bg4, R.drawable.bg1,
            R.drawable.bg2, R.drawable.bg5, R.drawable.bg8, R.drawable.bg12, R.drawable.bg3,
            R.drawable.bg10, R.drawable.bg7, R.drawable.bg14, R.drawable.bg15, R.drawable.bg13
        )
    ),
    SampleData(
        firstName = "Liam",
        lastName = "Brown",
        postsCount = 54,
        following = 19,
        followers = 4567,
        profilePicId = R.drawable.bg10,
        postsList = listOf(
            R.drawable.bg10, R.drawable.bg9, R.drawable.bg4, R.drawable.bg3, R.drawable.bg2,
            R.drawable.bg1, R.drawable.bg8, R.drawable.bg6, R.drawable.bg11, R.drawable.bg7,
            R.drawable.bg5, R.drawable.bg12, R.drawable.bg15, R.drawable.bg13, R.drawable.bg14
        )
    ),
    SampleData(
        firstName = "Amelia",
        lastName = "Taylor",
        postsCount = 73,
        following = 27,
        followers = 5678,
        profilePicId = R.drawable.bg11,
        postsList = listOf(
            R.drawable.bg11, R.drawable.bg4, R.drawable.bg9, R.drawable.bg2, R.drawable.bg13,
            R.drawable.bg1, R.drawable.bg10, R.drawable.bg6, R.drawable.bg14, R.drawable.bg3,
            R.drawable.bg7, R.drawable.bg8, R.drawable.bg5, R.drawable.bg12, R.drawable.bg15
        )
    ),
    SampleData(
        firstName = "Noah",
        lastName = "Wilson",
        postsCount = 36,
        following = 12,
        followers = 3456,
        profilePicId = R.drawable.bg12,
        postsList = listOf(
            R.drawable.bg12, R.drawable.bg1, R.drawable.bg2, R.drawable.bg15, R.drawable.bg9,
            R.drawable.bg3, R.drawable.bg6, R.drawable.bg8, R.drawable.bg11, R.drawable.bg7,
            R.drawable.bg4, R.drawable.bg5, R.drawable.bg10, R.drawable.bg13, R.drawable.bg14
        )
    ),
    SampleData(
        firstName = "Ava",
        lastName = "Johnson",
        postsCount = 41,
        following = 16,
        followers = 4567,
        profilePicId = R.drawable.bg13,
        postsList = listOf(
            R.drawable.bg13, R.drawable.bg3, R.drawable.bg6, R.drawable.bg7, R.drawable.bg12,
            R.drawable.bg1, R.drawable.bg8, R.drawable.bg14, R.drawable.bg11, R.drawable.bg2,
            R.drawable.bg4, R.drawable.bg5, R.drawable.bg9, R.drawable.bg10, R.drawable.bg15
        )
    ),
    SampleData(
        firstName = "Ethan",
        lastName = "Davis",
        postsCount = 64,
        following = 29,
        followers = 6789,
        profilePicId = R.drawable.bg14,
        postsList = listOf(
            R.drawable.bg14, R.drawable.bg6, R.drawable.bg2, R.drawable.bg4, R.drawable.bg11,
            R.drawable.bg8, R.drawable.bg9, R.drawable.bg10, R.drawable.bg3, R.drawable.bg5,
            R.drawable.bg1, R.drawable.bg12, R.drawable.bg15, R.drawable.bg7, R.drawable.bg13
        )
    ),
    SampleData(
        firstName = "Mia",
        lastName = "Martinez",
        postsCount = 83,
        following = 34,
        followers = 7890,
        profilePicId = R.drawable.bg15,
        postsList = listOf(
            R.drawable.bg15, R.drawable.bg8, R.drawable.bg6, R.drawable.bg3, R.drawable.bg2,
            R.drawable.bg1, R.drawable.bg11, R.drawable.bg10, R.drawable.bg9, R.drawable.bg7,
            R.drawable.bg14, R.drawable.bg12, R.drawable.bg4, R.drawable.bg13, R.drawable.bg5
        )
    )
)
