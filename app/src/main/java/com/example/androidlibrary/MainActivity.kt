package com.example.androidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.toast_preview.ToastPreview


class MainActivity : AppCompatActivity() {

    private lateinit var btn1:Button
    private lateinit var btn2:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)


        btn1.setOnClickListener {
            ToastPreview.toastShort(this,"Hello Short")
        }

        btn2.setOnClickListener {
            ToastPreview.toastLong(this,"Hello Long")
        }




    }
}