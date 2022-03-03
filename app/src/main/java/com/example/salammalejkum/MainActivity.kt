package com.example.salammalejkum

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    lateinit var p1: CheckBox
    lateinit var p2: CheckBox
    lateinit var p3: CheckBox
    lateinit var p4: CheckBox
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        p1 = findViewById(R.id.checkBox)
        p2 = findViewById(R.id.checkBox2)
        p3 = findViewById(R.id.checkBox3)
        p4 = findViewById(R.id.checkBox4)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            var razem: Int = 0
            val result = StringBuilder()
            result.append("Zaznaczone Items")
            if (p1.isChecked) {
                result.append("\nfungi 51")
                razem += 51
            }
            if (p2.isChecked) {
                result.append("\nCaprisosaq 50")
                razem += 50
            }
            if (p3.isChecked) {
                result.append("\nHawajska 45")
                razem += 45
            }
            if (p4.isChecked) {
                result.append("\n4mmc 756565")
                razem += 756565
            }
            result.append("\nRazem: " + razem + "zł")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}