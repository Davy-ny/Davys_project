package com.example.davysproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TextInputActivity : AppCompatActivity() {
    lateinit var blank:TextView
    lateinit var anything:EditText
    lateinit var ok:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_input)

        blank = findViewById(R.id.textmain)
        anything = findViewById(R.id.edtext)
        ok = findViewById(R.id.btnok)

        ok.setOnClickListener(){
            var push = anything.text.toString().trim()
            blank.setText(push)
        }
    }
}