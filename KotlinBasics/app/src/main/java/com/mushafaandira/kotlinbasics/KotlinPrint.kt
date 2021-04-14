package com.mushafaandira.kotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kotlin_print.*

class KotlinPrint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_print)
        print_to_variable.setOnClickListener {
            val intent = Intent(this, KotlinVariable::class.java)
            startActivity(intent)
        }
        print_to_operators.setOnClickListener {
            val intent = Intent(this, KotlinOperators::class.java)
            startActivity(intent)
        }
    }
}