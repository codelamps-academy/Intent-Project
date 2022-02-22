package com.blackspring.intentproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blackspring.intentproject.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var firstName = intent.extras?.getString("firstName")
        var lastName = intent.extras?.getString("lastName")
        var age = intent.extras?.getString("age")
        var address = intent.extras?.getString("address")
        var job = intent.extras?.getString("myJob")

        txt_tampil.setText("$firstName $lastName \n $age \n $address \n $job")
        btn_submenu.setOnClickListener(){
            val intent:Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}