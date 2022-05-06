package com.myandroidapp.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BMICalculatorActivity : AppCompatActivity() {
    lateinit var btnSendMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalculator)
        btnSendMoney=findViewById(R.id.btnSendMoney)
        btnSendMoney.setOnClickListener {
            val intent=Intent(this,MobilePesaActivity::class.java)
            startActivity(intent)
        }
    }
}