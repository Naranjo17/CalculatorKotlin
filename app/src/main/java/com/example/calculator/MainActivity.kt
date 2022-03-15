package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1=findViewById<EditText>(R.id.txt1)
        val n2 = findViewById<EditText>(R.id.txt2)
        val r = findViewById<TextView>(R.id.tv)
        val btnsumar = findViewById<Button>(R.id.btnSum)
        val btnrestar = findViewById<Button>(R.id.btnSus)
        val btnmulti = findViewById<Button>(R.id.btnMul)
        val btndivi = findViewById<Button>(R.id.btnDiv)

        btnsumar.setOnClickListener {
            r.setText(
                "LA SUMA ES: "+(n1.text.toString().toInt()+ n2.text.toString().toInt())
            )
        }

        btnrestar.setOnClickListener {
            r.setText(
                "LA RESTA ES: "+(n1.text.toString().toInt()- n2.text.toString().toInt())
            )
        }

        btnmulti.setOnClickListener {
            r.setText(
                "LA MULTIPLICACION ES: "+(n1.text.toString().toInt()* n2.text.toString().toInt())
            )
        }

        btndivi.setOnClickListener {
            r.setText(
                "LA DIVISION ES: "+(n1.text.toString().toInt()/ n2.text.toString().toInt())
            )
        }
    }
}