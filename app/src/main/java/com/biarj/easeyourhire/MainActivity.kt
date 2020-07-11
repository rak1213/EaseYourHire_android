package com.biarj.easeyourhire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val startAct = Intent(this@MainActivity, LanguageActivity::class.java)
            startActivity(startAct)
            finish()
        },2000)

    }
}