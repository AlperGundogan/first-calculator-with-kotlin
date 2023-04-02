package com.example.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.firstcalculator.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button0 = findViewById<Button>(R.id.button0)
        val button_add = findViewById<Button>(R.id.button_add)
        val button_subtraction = findViewById<Button>(R.id.button_subtraction)
        val button_multiplication = findViewById<Button>(R.id.button_multiplication)
        val button_division = findViewById<Button>(R.id.button_division)
        val button_equal = findViewById<Button>(R.id.button_equal)
        val conclusion = findViewById<TextView>(R.id.conclusion)
        var metin = ""
        val functions = Functions()


        button1.setOnClickListener {
            metin += button1.text as String
            conclusion.text = metin
        }

        button2.setOnClickListener {
            metin += button2.text as String
            conclusion.text = metin
        }

        button3.setOnClickListener {
            metin += button3.text as String
            conclusion.text = metin
        }

        button4.setOnClickListener {
            metin += button4.text as String
            conclusion.text = metin
        }

        button5.setOnClickListener {
            metin += button5.text as String
            conclusion.text = metin
        }

        button6.setOnClickListener {
            metin += button6.text as String
            conclusion.text = metin
        }

        button7.setOnClickListener {
            metin += button7.text as String
            conclusion.text = metin
        }

        button8.setOnClickListener {
            metin += button8.text as String
            conclusion.text = metin
        }

        button9.setOnClickListener {
            metin += button9.text as String
            conclusion.text = metin
        }

        button0.setOnClickListener {
            metin += button0.text as String
            conclusion.text = metin
        }

        button_add.setOnClickListener {
            val newMetin = metin.substring(0, metin.length - 1)
            val negativeMetin = metin.substring(1, metin.length)

            if (functions.lastCharCheck(string = metin, Values().transactionsList)) {
                metin = "$newMetin+"
                conclusion.text = metin

            }else if (functions.containsChar(string = metin, transactionsList = Values().transactionsList)) {
                metin = functions.equal(string = metin)
                conclusion.text = metin

            }else{
                metin += button_add.text as String
                conclusion.text = metin
            }
        }

        button_subtraction.setOnClickListener {
            val newMetin = metin.substring(0, metin.length - 1)
            if (functions.lastCharCheck(string = metin, Values().transactionsList)){
                metin = "$newMetin-"
                conclusion.text = metin

            }else if (functions.containsChar(string = metin, transactionsList = Values().transactionsList)) {
                metin = functions.equal(string = metin)
                conclusion.text = metin

            }else{
                metin += button_subtraction.text as String
                conclusion.text = metin
            }
        }

        button_multiplication.setOnClickListener {
            val newMetin = metin.substring(0, metin.length - 1)
            if (functions.lastCharCheck(string = metin, Values().transactionsList)){
                metin = newMetin + "x"
                conclusion.text = metin

            }else if (functions.containsChar(string = metin, transactionsList = Values().transactionsList)) {
                metin = functions.equal(string = metin)
                conclusion.text = metin

            }else{
                metin += button_multiplication.text as String
                conclusion.text = metin
            }
        }

        button_division.setOnClickListener {
            val newMetin = metin.substring(0, metin.length - 1)
            if (functions.lastCharCheck(string = metin, Values().transactionsList)){
                metin = "$newMetin/"
                conclusion.text = metin

            }else if (functions.containsChar(string = metin, transactionsList = Values().transactionsList)) {
                metin = functions.equal(string = metin)
                conclusion.text = metin

            }else{
                metin += button_division.text as String
                conclusion.text = metin
            }
        }

        button_equal.setOnClickListener {
            metin = functions.equal(string = metin)
            conclusion.text = metin
        }

    }
}