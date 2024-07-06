package com.example.button

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var num = 0

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val dec = findViewById<Button>(R.id.btn1)
        val inc = findViewById<Button>(R.id.btn2)
        val reset = findViewById<Button>(R.id.btn3)
        val text = findViewById<TextView>(R.id.num)

        dec.setOnClickListener {
            Toast.makeText(this, "-1", Toast.LENGTH_SHORT).show()
            num--
            text.text = num.toString()
        }
        inc.setOnClickListener {
            Toast.makeText(this, "+1", Toast.LENGTH_SHORT).show()
            num++
            text.text = num.toString()
        }
        reset.setOnClickListener {
            Toast.makeText(this, "RESET", Toast.LENGTH_SHORT).show()
           num = 0
            text.text = num.toString()
        }
    }
}