package r1p.net.myapplication.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import r1p.net.myapplication.NetworkConfiguration
import r1p.net.myapplication.model.Post
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class mainViewModel : ViewModel() {
    val api = NetworkConfiguration.getPlaceholderApi()

    private val mutablePostData = MutableLiveData<List<Post>>()

    val postData: LiveData<List<Post>>
        get() = mutablePostData

    fun fetchPosts() {

        api.getPosts().enqueue(object : Callback<List<Post>> {
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                if (response.isSuccessful)
                    mutablePostData.postValue(response?.body())
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
            }
        })
    }
}