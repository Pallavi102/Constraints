package com.pallavi.linearlayouttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvemail:TextView
    lateinit var etemail:EditText
    lateinit var tvpass:TextView
    lateinit var etpassword:EditText
    lateinit var tvforget:TextView
    lateinit var blogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvemail=findViewById(R.id.tvemail)
        etemail=findViewById(R.id.etemail)
        tvpass=findViewById(R.id.tvpass)
        etpassword=findViewById(R.id.etpassword)
        tvforget=findViewById(R.id.tvforget)

        blogin=findViewById(R.id.blogin)
        blogin.setOnClickListener {
            if(etemail.text.isEmpty())
            {
                etemail.error="enter your name"
            }
            else(etpassword.text.isEmpty())
            {
                etpassword.error="please enter your password"
            }



        }


    }
}