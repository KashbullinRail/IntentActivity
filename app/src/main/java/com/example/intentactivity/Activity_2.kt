package com.example.intentactivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Activity_2: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
         }

    fun onClickGoAct_3(view: View){
        val intent = Intent(this, Activity_3::class.java)
        startActivity(intent)
    }

}