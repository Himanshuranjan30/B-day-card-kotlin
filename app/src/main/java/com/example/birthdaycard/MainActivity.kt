package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button=findViewById<Button>(R.id.btn_create)
        button.setOnClickListener{
            val et=findViewById<EditText>(R.id.et_name)
            val name=et.editableText.toString()
            Toast.makeText(this,"name is $name",Toast.LENGTH_SHORT).show()
            val intent=Intent(this,GreetingActivity::class.java)
            intent.putExtra(GreetingActivity.NAME_EXTRA,name)
            startActivity(intent)
        }

    }
}