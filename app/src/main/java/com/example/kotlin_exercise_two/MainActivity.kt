package com.example.kotlin_exercise_two

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val tipPercentage = tipPercentageEditText.text.toString().toDouble() / 100
            val tip = bill * tipPercentage
            val total = bill + tip

            infoTextView.visibility = View.VISIBLE
            infoTextView.text = "Tip: \$" + tip + " Total: \$" + total
        }
    }
}