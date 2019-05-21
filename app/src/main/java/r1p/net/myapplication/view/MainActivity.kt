package r1p.net.myapplication.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import r1p.net.myapplication.R
import r1p.net.myapplication.viewmodel.mainViewModel

//USER INTERFACE

class MainActivity : AppCompatActivity(), BlankFragment.OnFragmentInteractionListener {

    lateinit var viewModel: mainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vp?.adapter = Pageradapter(supportFragmentManager)
        tabs.setupWithViewPager(vp)

        // vp.setCurrentItem(0)
        viewModel = ViewModelProviders.of(this).get(mainViewModel::class.java)

        viewModel.postData.observe(this, Observer { postData ->
            if (postData != null) {
                Log.e("result", postData.toString())
                //posts.text = postData.toString()
            }
        })

        viewModel.fetchPosts()
    }

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
