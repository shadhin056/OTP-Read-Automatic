package com.shadhin.otp_read_automatic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnOTP1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
        buttonAction();
    }

    private fun init() {
        btnOTP1=findViewById(R.id.btnOTP1) as Button
    }
    private fun buttonAction(){
        btnOTP1.setOnClickListener{
            val intent =Intent(this,OTP_1_Activity::class.java)
            startActivity(intent)
        }
    }
}
