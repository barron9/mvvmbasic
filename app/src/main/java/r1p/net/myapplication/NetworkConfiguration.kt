package r1p.net.myapplication

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object NetworkConfiguration {

    const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .client(OkHttpClient())
        .baseUrl(BASE_URL)
        .build()

    fun getPlaceholderApi(): api {
        return retrofit.create(api::class.java)
    }
}