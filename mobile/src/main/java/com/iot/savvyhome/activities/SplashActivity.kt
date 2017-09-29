package com.iot.savvyhome.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.iot.savvyhome.R
import java.util.*

class SplashActivity : AppCompatActivity() {
    val instance = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        handler.postDelayed(object: Runnable {
            override fun run() {
                val intent = Intent(instance, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 3000)
    }
}
