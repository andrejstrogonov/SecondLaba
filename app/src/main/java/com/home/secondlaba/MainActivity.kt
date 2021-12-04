package com.home.secondlaba

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.home.secondlaba.gui.TableActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button =findViewById(R.id.btn_login)
        button.setOnClickListener{
            val secondIntent=Intent(this, TableActivity::class.java)
            startActivity(secondIntent)
        }
    }

}