package com.example.intentactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.intentactivity.databinding.Activity2Binding

class Activity_2 : AppCompatActivity() {

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra(KEY)
        binding.tvMessage.text = message

    }

    fun onClickGoAct_1(view: View) {
        intent.putExtra(KEY2, binding.etAnswer.text.toString())
        setResult(RESULT_OK, intent)
        Log.d("TAGGER", "setResult")
        finish()
    }

    fun onClickGoAct_3(view: View){
        val i = Intent(this, Activity_3::class.java)
        startActivity(i)
    }

}