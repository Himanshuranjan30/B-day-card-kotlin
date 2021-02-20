package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val name=intent.getStringExtra(NAME_EXTRA)
        val bdaytext=findViewById<TextView>(R.id.tv_greeting)
        bdaytext.text="Happy Birthday\n $name!"

    }
}