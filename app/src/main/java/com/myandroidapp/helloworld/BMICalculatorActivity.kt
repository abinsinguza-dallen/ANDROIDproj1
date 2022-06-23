package com.myandroidapp.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BMICalculatorActivity : AppCompatActivity() {
    lateinit var btnCalculate:Button
    lateinit var etWeight:EditText
    lateinit var etHeight:EditText
    lateinit var tvBmi:TextView
    lateinit var tvanswer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalculator)

        btnCalculate=findViewById(R.id.btnCalculate)
        etWeight=findViewById(R.id.etWeight)
        etHeight=findViewById(R.id.etHeight)
        tvBmi=findViewById(R.id.tvBmi)
        tvanswer=findViewById(R.id.tvanswer)

        btnCalculate.setOnClickListener {
            var weight=etWeight.text.toString()
            var height=etHeight.text.toString()
            if (weight. isBlank()){
                etWeight.error="weight is required"
                return@setOnClickListener
            }
            if (height.isBlank()){
                etHeight.error ="height is required"
                return@setOnClickListener
            }
            calculateBmi(weight.toDouble(),height.toInt())
         }

    }
    fun calculateBmi(weight:Double,height:Int){
        var heightMetres=height/100.0
        var bmi=weight/(heightMetres*heightMetres)
        if (bmi<18.5){
            tvanswer.text="underweight"
        }
        if (bmi>18.5 && bmi<25.0 ){
            tvanswer.text="Normal"
        }
        if (bmi>25.0 && bmi<30.0){
            tvanswer.text="overweight"
        }
        if (bmi>30.0)
            tvanswer.text="obese"
        tvBmi.text=bmi.toString()
    }
}