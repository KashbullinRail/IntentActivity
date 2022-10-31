package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.intentactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingS: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingS = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingS.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("TAG", "result001")
        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null){
            Log.d("TAG", "result")
            bindingS.tvWhy.text = data.getStringExtra(KEY2)
        }
    }

    fun onClickGoAct_2(view: View) {
        val intent = Intent(this, Activity_2::class.java)
        intent.putExtra(KEY, "что мне передать?")
        startActivityForResult(intent, REQUEST_CODE)
    }

}