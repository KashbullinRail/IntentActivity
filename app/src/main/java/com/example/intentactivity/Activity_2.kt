package com.example.intentactivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.intentactivity.databinding.Activity2Binding

class Activity_2 : AppCompatActivity() {

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickGoAct_3(view: View) {
        val intent = Intent(this, Activity_3::class.java)
        startActivity(intent)
    }

}