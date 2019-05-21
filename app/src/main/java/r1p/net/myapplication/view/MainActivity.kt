package r1p.net.myapplication.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import r1p.net.myapplication.R
import r1p.net.myapplication.viewmodel.mainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: mainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(mainViewModel::class.java)

        viewModel.postData.observe(this, Observer { postData ->
            if (postData != null) {
                Log.e("result",postData.toString())
                //posts.text = postData.toString()
            }
        })

        viewModel.fetchPosts()
    }
}
