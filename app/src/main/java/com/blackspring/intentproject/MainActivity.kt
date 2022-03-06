package com.blackspring.intentproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blackspring.intentproject.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // INTENT EKS
        btn_menu.setOnClickListener(){
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("firstName", "Andre Rizaldi ")
            intent.putExtra("lastName", "Brillianto")
            intent.putExtra("age", "26")
            intent.putExtra("address", "Wijahan, Kemranjen, Banyumas, Jawa Tengah")
            intent.putExtra("myJob", "Programming")
            startActivity(intent)
        }


    }
}