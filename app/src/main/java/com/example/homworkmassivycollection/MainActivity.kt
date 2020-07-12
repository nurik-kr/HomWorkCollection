package com.example.homworkmassivycollection

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val IntMassiv = arrayOf(-4, 45, 234, 234, 23)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1 = findViewById<EditText>(R.id.et1)
        val tv1 = findViewById<TextView>(R.id.tv1)
        val et2 = findViewById<EditText>(R.id.et2)
        val tv2 = findViewById<TextView>(R.id.tv2)
        val et3 = findViewById<EditText>(R.id.et3)
        val tv3 = findViewById<TextView>(R.id.tv3)
        val et4 = findViewById<EditText>(R.id.et4)
        val tv4 = findViewById<TextView>(R.id.tv4)
        val et5 = findViewById<EditText>(R.id.et5)
        val tv5 = findViewById<TextView>(R.id.tv5)
        val btnRefresh = findViewById<Button>(R.id.btnRefresh)

        et1.setText(IntMassiv[0].toString())
        et2.setText(IntMassiv[1].toString())
        et3.setText(IntMassiv[2].toString())
        et4.setText(IntMassiv[3].toString())
        et5.setText(IntMassiv[4].toString())
        tv1.text = IntMassiv[0].toString()
        tv2.text = IntMassiv[1].toString()
        tv3.text = IntMassiv[2].toString()
        tv4.text = IntMassiv[3].toString()
        tv5.text = IntMassiv[4].toString()


        val preference = getSharedPreferences("Preference", Context.MODE_PRIVATE)

        btnRefresh.setOnClickListener {
            val mas1 = et1.text.toString()
            val mas2 = et2.text.toString()
            val mas3 = et3.text.toString()
            val mas4 = et4.text.toString()
            val mas5 = et5.text.toString()
            preference.edit().putString("text", mas1).apply()
            preference.edit().putString("text1", mas2).apply()
            preference.edit().putString("text2", mas3).apply()
            preference.edit().putString("text3", mas4).apply()
            preference.edit().putString("text4", mas5).apply()
            tv1.text = mas1         //как правильнее будет
            tv2.text = "$mas2"         //из этих трех вариантов
            tv3.text = mas3.toString()
            tv4.text = mas4.toString()
            tv5.text = mas5.toString()
        }
    }
}


