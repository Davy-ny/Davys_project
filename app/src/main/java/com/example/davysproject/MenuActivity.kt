package com.example.davysproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    lateinit var home: Button
    lateinit var about:Button
    lateinit var blog:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        home = findViewById(R.id.btnhome)
        home.setOnClickListener(){
            var move = Intent(this,HomeActivity::class.java)
            startActivity(move)}

        about = findViewById(R.id.btnabout)
        about.setOnClickListener(){
            var move = Intent(this, AboutActivity::class.java)
            startActivity(move) }

        blog = findViewById(R.id.btnblog)
        blog.setOnClickListener(){
            var move = Intent(this, BlogActivity::class.java)
            startActivity(move) }
    }
}