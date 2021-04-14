package com.mushafaandira.kotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kotlin_variable.*

class KotlinVariable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_variable)
        variable_to_print.setOnClickListener {
            val intent = Intent(this, KotlinPrint::class.java)
            startActivity(intent)
        }
    }
}