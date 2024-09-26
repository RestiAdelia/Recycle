package com.restiadelia.list

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailbuah : AppCompatActivity() {
    private lateinit var txtdetailbuah : TextView
    private lateinit var imagebuah : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailbuah)

        txtdetailbuah =findViewById(R.id.txtdetailbuah)
        imagebuah=findViewById(R.id.imagebuah)

        val detailtext =intent.getStringExtra("nama")
        val detailgambar =intent.getIntExtra("image",0)

        txtdetailbuah.setText(detailtext)
        imagebuah.setImageResource(detailgambar)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}