package com.e.kotlinexample.api

import androidx.lifecycle.LiveData
import com.e.kotlinexample.model.BlogPost
import com.e.kotlinexample.model.User
import com.e.kotlinexample.util.GenericApiResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("placeholder/blogs")
    fun getBlogPosts(): LiveData<GenericApiResponse<List<BlogPost>>>

    @GET("placeholder/user/{userId}")
    fun getUser(
        @Path("userId") userId: String
    ): LiveData<GenericApiResponse<User>>
}