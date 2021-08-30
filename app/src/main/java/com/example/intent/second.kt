package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second.*

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var bundle:Bundle?=intent.extras
        var s=bundle!!.get("giventext").toString()
        text2.text=s
        button.setOnClickListener {
            var str="str"
            var intent=Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,str)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"choose your app"))
        }
    }
}