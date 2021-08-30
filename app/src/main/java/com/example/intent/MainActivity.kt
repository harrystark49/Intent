package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var summ:String="haiiii"
        sum.setOnClickListener {
            Toast.makeText(this,"the sum is $summ", Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener {
            var s:String=text1.text.toString()
            var intent=Intent(this,second::class.java)
            startActivity(intent)
        }
    }


}