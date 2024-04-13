package com.example.yourappname

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)
        val addButton = findViewById<Button>(R.id.addButton)
        val resultView = findViewById<TextView>(R.id.resultView)

        addButton.setOnClickListener {
            val num1 = number1.text.toString().toDoubleOrNull()
            val num2 = number2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val sum = num1 + num2
                resultView.text = "Result: $sum"
            } else {
                resultView.text = "Please enter valid numbers"
            }
        }
    }
}
