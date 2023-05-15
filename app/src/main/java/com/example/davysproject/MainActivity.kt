package com.example.davysproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var menu:Button
    lateinit var register:Button
    lateinit var txtinput:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu = findViewById(R.id.btnmenu)
        menu.setOnClickListener(){
            var open = Intent(this, MenuActivity::class.java)
            startActivity(open)}

        register = findViewById(R.id.btnsignup)
        register.setOnClickListener(){
            var reg = Intent(this, RegisterActivity::class.java)
            startActivity(reg) }

        txtinput = findViewById(R.id.btntextinput)
        txtinput.setOnClickListener(){
            var find = Intent(this, TextInputActivity::class.java)
            startActivity(find) }

    }
}