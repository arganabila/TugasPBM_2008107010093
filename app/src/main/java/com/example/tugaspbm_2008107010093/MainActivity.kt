package com.example.tugaspbm_2008107010093

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var sharedPref: PreferencesHelper

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPref = PreferencesHelper(this)

        var npm =findViewById<EditText>(R.id.editNpm)
        val button = findViewById<Button>(R.id.btn_submit)
        var pass = findViewById<EditText>(R.id.editPassword)

        button.setOnClickListener{
    }
}