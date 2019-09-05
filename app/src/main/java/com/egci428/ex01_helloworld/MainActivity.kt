package com.egci428.ex01_helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        updateBtn.setOnClickListener {
            txtLabel.text = editText1.text
        }

        add.setOnClickListener {
            var x: Int = editText1.text.toString().toInt()
            var y: Int = editText2.text.toString().toInt()
            var z: Int = x+y
            txtLabel.text = z.toString()
        }
        minus.setOnClickListener {
            var x: Int = editText1.text.toString().toInt()
            var y: Int = editText2.text.toString().toInt()
            var z: Int = x-y
            txtLabel.text = z.toString()
        }
    }
}
