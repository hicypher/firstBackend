package com.hicypher.firstbackend

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(findViewById(R.id.toolbar))
        toolbar.setTitle("Home")
        toolbar.setSubtitle("Second Page")

        fab.setOnClickListener{ view->
            Snackbar.make(view,"Would you like to save",Snackbar.LENGTH_LONG).setAction("Save",
                View.OnClickListener { Log.d("122","Fab pressed") }).show()
            textView.text=intent.getStringExtra("id").toString()
            password.text=intent.getStringExtra("pass").toString()

        }

    }
}