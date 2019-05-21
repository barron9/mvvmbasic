package r1p.net.myapplication.view

import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.support.v7.app.AppCompatActivity


class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(r1p.net.myapplication.R.layout.activity_splash)
        Handler().postDelayed(Runnable {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }, 4000)
    }
}
