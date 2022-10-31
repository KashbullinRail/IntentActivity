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

//        val list = listOf(0, 345, 323, 355)
//        val list2 = list.sum()
//        Log.d("TAG123", "LIST = ${list2.toString()}")
//        val list3 = list.sorted()
//        Log.d("TAG123", "LIST = ${list3.toString()}")
//        val list4 = list.reversed()
//        Log.d("TAG123", "LIST = ${list4.toString()}")
//        val list5 = list.size
//        Log.d("TAG123", "LIST = ${list5.toString()}")

//        for (index in list) Log.d("TAG123", "LIST = $index")
//        for ((index, item) in list.withIndex()) Log.d("TAG123", "LIST = $index = $item")
//        for (index in 10 downTo 3) {
//            var list11 = arrayListOf<Int>(11)
//            list11.add(index, index)
//            Log.d("TAG1234", "for ${list11.toString()}")
//        }
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