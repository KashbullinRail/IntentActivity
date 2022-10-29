package com.example.intentactivity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.intentactivity.databinding.Activity3Binding

class Activity_3 : AppCompatActivity() {

    private lateinit var binding: Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickGoCloseAct_2(view: View) {
        finish()
    }

}