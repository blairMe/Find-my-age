package com.bfa.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bCal.setOnClickListener {
            buttonGetsClicked()
        }
    }
    private fun buttonGetsClicked() {
        val yearOfBirth = Integer.parseInt(yearOB.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val userAge = currentYear - yearOfBirth
        result.text = "Your age is $userAge Years"
        //using Log
        Log.d("buttonMe", "Your age is $userAge years")
    }
}