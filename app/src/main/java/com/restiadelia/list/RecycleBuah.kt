package com.restiadelia.list

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.list.adapter.BuahAdapter
import com.restiadelia.list.model.MockList
import com.restiadelia.list.model.ModelBuah

class RecycleBuah : AppCompatActivity() {
    private lateinit var rv_buah: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_buah)
        rv_buah = findViewById(R.id.rv_buah)

        // Use GridLayoutManager with a span count
        rv_buah.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true)

        // Set adapter
        val adapter = BuahAdapter(MockList.getModel(this) as ArrayList<ModelBuah>, this)
    rv_buah.adapter=adapter
     //   pripareDataBuah()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
//
//    private fun pripareDataBuah() {
//                val itemModel1 = ModelBuah(
//                    image = R.drawable.apple,
//                    nama = "Apple",
//                    lokasi = "indonesia",
//                    R.string.st_apel.toString()
//
//                )
//        itemModel1.add
//                val itemModel2 = ModelBuah(
//                    image = R.drawable.grapes,
//                    nama = "Anggur",
//                    lokasi = "indonesia",
//                    R.string.st_Anggur.toString()
//                )
//                val itemModel3 = ModelBuah(
//                    image = R.drawable.orange,
//                    nama = "Jeruk",
//                    lokasi = "indonesia",
//                    R.string.st_jeruk.toString()
//                )
//                val itemModel4 = ModelBuah(
//                    image = R.drawable.pear,
//                    nama = "Pir",
//                    lokasi = "indonesia",
//                    R.string.st_pear.toString()
//
//
//                )
//                val itemModel5 = ModelBuah(
//                    image = R.drawable.strawberry,
//                    nama = "Strawberry",
//                    lokasi = "indonesia",
//                    R.string.st_strawberry.toString()
//                )
//            }
    }
