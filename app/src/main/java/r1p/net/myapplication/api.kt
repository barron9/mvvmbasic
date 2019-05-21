package r1p.net.myapplication

import r1p.net.myapplication.model.Post
import retrofit2.Call
import retrofit2.http.GET

interface api {
    @GET("/posts")
    fun getPosts(): Call<List<Post>>
}