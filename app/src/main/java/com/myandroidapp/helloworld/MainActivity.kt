package com.myandroidapp.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi : Button
    lateinit var btnSendMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi =findViewById(R.id.btnCalculatorBmi)
        btnBmi.setOnClickListener {
          val intent = Intent(this,BMICalculatorActivity::class.java)
            startActivity(intent)
        }
        btnSendMoney=findViewById(R.id.btnSendMoney)
        btnSendMoney.setOnClickListener {
            val intent=Intent(this,MobilePesaActivity::class.java)
            startActivity(intent)
        }
    }
}