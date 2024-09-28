package com.restiadelia.list.model

import android.content.Context
import com.restiadelia.list.R

data class ModelBuah(
    val image: Int,
    val nama: String,
    var lokasi: String,
    var descripsi :String
)

object MockList {

    fun getModel(context: Context): List<ModelBuah> {
        val itemModel1 = ModelBuah(
            image = R.drawable.apple,
            nama = "Apple",
            lokasi = "indonesia",
      // R.string.st_apel.toString()
            context.getString(R.string.st_apel)

        )
        val itemModel2 = ModelBuah(
            image = R.drawable.grapes,
            nama = "Anggur",
            lokasi = "indonesia",
           // R.string.st_Anggur.toString()
            context.getString(R.string.st_Anggur)
        )
        val itemModel3 = ModelBuah(
            image = R.drawable.orange,
            nama = "Jeruk",
            lokasi = "indonesia",
           // R.string.st_jeruk.toString()
            context.getString(R.string.st_jeruk)
        )
        val itemModel4 = ModelBuah(
            image = R.drawable.pear,
            nama = "Pir",
            lokasi = "indonesia",
           // R.string.st_pear.toString()
            context.getString(R.string.st_pear)


        )
        val itemModel5 = ModelBuah(
           image = R.drawable.strawberry,
            nama = "Strawberry",
            lokasi = "indonesia",
          //  R.string.st_strawberry.toString()
            context.getString(R.string.st_strawberry)
        )

        val itemList : ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList




    }
}
