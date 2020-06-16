package com.e.kotlinexample.ui.main.state

import com.e.kotlinexample.model.BlogPost
import com.e.kotlinexample.model.User

data class MainViewState(

    var blogPosts: List<BlogPost>? = null,

    var user: User? = null

)