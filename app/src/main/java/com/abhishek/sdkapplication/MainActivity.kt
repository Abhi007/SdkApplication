package com.abhishek.sdkapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.sdklibrary.SimpleToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SimpleToast.showToast(this, "Hi Toast Library is here")
    }
}