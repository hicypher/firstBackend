package com.hicypher.firstbackend

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var userid="user1"
        var password="111"
        btn.setOnClickListener {
            if (uid.text.toString().isNullOrEmpty() || !uid.text.toString().equals("User1")){ uid.setError("Please enter valid Id")  }
           else if (pass.text.toString().isNullOrEmpty() ||! pass.text.toString().equals("111")){ pass.setError("Please enter valid password") }
            else {
                Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show()
                startActivity(Intent(this,MainActivity2::class.java).putExtra("id",userid).putExtra("pass",password))
            }
        }

    }
}