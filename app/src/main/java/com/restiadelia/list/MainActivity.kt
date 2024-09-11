package com.restiadelia.list

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var txtJudul: TextView
    private lateinit var btnBuku: Button
    private lateinit var btnList: Button
    private lateinit var btnBuah: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtJudul = findViewById(R.id.txtJudul)
        btnBuku = findViewById(R.id.btnBuku)
        btnList = findViewById(R.id.btnList)
        btnBuah = findViewById(R.id.btnBuah)

        btnList.setOnClickListener {
            val intentToList = Intent(this, list::class.java)
            startActivity(intentToList) // Perbaikan di sini
        }

        btnBuku.setOnClickListener {
            val intentToRecycleView = Intent(this, RecycleView::class.java)
            startActivity(intentToRecycleView)
        }

        btnBuah.setOnClickListener {
            val intentToRecycleBuah = Intent(this, RecycleBuah::class.java)
            startActivity(intentToRecycleBuah) // Perbaikan di sini
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}