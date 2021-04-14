package com.mushafaandira.kotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kotlin_variable_button.setOnClickListener {
            val intent = Intent(this, KotlinVariable::class.java)
            startActivity(intent)
        }
        kotlin_print_button.setOnClickListener {
            val intent = Intent(this, KotlinPrint::class.java)
            startActivity(intent)
        }
        kotlin_operators_button.setOnClickListener {
            val intent = Intent(this, KotlinOperators::class.java)
            startActivity(intent)
        }
    }
}