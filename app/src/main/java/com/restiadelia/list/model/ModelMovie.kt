package com.restiadelia.list.model

import com.restiadelia.list.R

data class ModelMovie(
   val gambar : Int,
   val judul : String,
   val sinopsis : String
)

object MovieList {
   fun getModel() : List<ModelMovie> {
      val itemModel1 = ModelMovie(
         R.drawable.avatar,
         "Avatar",
         "Film Avatar ditayangkan secara perdana di Odeon Leicester Square pada tanggal 10 Desember 2009[4] dan dirilis di Britania Raya pada tanggal 17 Desember 2009 dan di Amerika Serikat pada tanggal 18 Desember 2009.[5][6] Film ini mendapatkan review positif dari para kritikus."
      )

      val itemModel2 = ModelMovie(
         R.drawable.end_game,
         "End Game",
         "Avengers: Endgame adalah film pahlawan super Amerika tahun 2019 yang berdasarkan kisah tim pahlawan super Avengers dari Marvel Comics. Film yang diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures ini adalah sekuel langsung Avengers: Infinity War (2018) dan merupakan film ke-22 Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Anthony dan Joe Russo dan ditulis oleh Christopher Markus dan Stephen McFeely, dan menampilkan pemeran ensambel di antaranya Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth, Scarlett Johansson, Jeremy Renner, Don Cheadle, Paul Rudd, Brie Larson, Karen Gillan, Danai Gurira, Benedict Wong, Jon Favreau, Bradley Cooper, Gwyneth Paltrow, dan Josh Brolin. Pada film ini, anggota Avengers yang masih hidup dan para sekutunya berusaha untuk membalikkan kerusakan yang disebabkan oleh Thanos dalam Infinity War."

      )

      val itemModel3 = ModelMovie(
         R.drawable.batman,
         "Batman",
         "Batman (manusia kelelawar) adalah tokoh pahlawan super fiksi yang diciptakan oleh seniman Bob Kane dan penulis Bill Finger[1][2] dan diterbitkan oleh DC Comics. Tokoh ini pertama muncul di Detective Comics #27 (Mei 1939). Identitas asli Batman adalah Bruce Wayne, seorang pengusaha yang kaya raya. Nama Bruce Wayne itu sendiri diambil dari nama tokoh sejarah, yaitu Robert the Bruce dan Anthony Wayne.[6]"
      )

      val itemModel4 = ModelMovie(
         R.drawable.venom,
         "Venom",
         "Venom adalah film yang berfokus pada Eddie Brock, seorang jurnalis yang terinfeksi oleh simbiote alien bernama Venom. Setelah terhubung dengan Venom, Eddie mendapatkan kekuatan super, tetapi juga harus menghadapi konflik batin dan ancaman dari musuh yang berbahaya. Film ini mengeksplorasi hubungan antara Eddie dan Venom, serta perjuangan Eddie untuk menjadi pahlawan meskipun dengan cara yang tidak konvensional. Tema utama film ini mencakup identitas dan konflik moral."
      )


      val itemModel5 = ModelMovie(
         R.drawable.inception,
         "Inception",
         "Inception adalah film fiksi ilmiah yang disutradarai oleh Christopher Nolan, mengisahkan tentang Dom Cobb (diperankan oleh Leonardo DiCaprio), seorang pencuri yang sangat terampil dalam seni inception – memasuki mimpi seseorang dan mencuri informasi dari alam bawah sadar mereka. Cobb diberi misi yang sangat berbahaya, bukan untuk mencuri, melainkan untuk menanamkan ide ke dalam pikiran seseorang. Untuk melakukannya, ia harus bersama timnya masuk ke mimpi dalam mimpi, menciptakan lapisan mimpi yang semakin dalam. Film ini mengangkat tema kompleks tentang realitas, mimpi, dan alam bawah sadar, dengan teka-teki psikologis yang mendalam."
      )

      val itemModel6 = ModelMovie(
         R.drawable.jumanji,
         "Jumanji",
         "Jumanjiadalah film petualangan fantasi yang berfokus pada sebuah permainan papan (atau video game dalam versi modern) misterius yang memiliki kekuatan ajaib. Siapa pun yang bermain game ini akan tersedot ke dalam dunia petualangan berbahaya, di mana mereka harus menyelesaikan tantangan untuk bisa keluar. Dalam film versi baru seperti Jumanji: Welcome to the Jungle, sekelompok remaja terjebak dalam tubuh avatar karakter video game dengan kemampuan unik, dan mereka harus bekerja sama untuk bertahan hidup di dunia Jumanji yang penuh jebakan, hewan buas, dan teka-teki. Film ini menonjolkan tema kerja sama, persahabatan, dan keberanian dalam menghadapi situasi ekstrem."
      )

      val itemModel7 = ModelMovie(
         R.drawable.jurassic_world,
         "Jurassic World",
         "Jurassic World adalah film aksi fiksi ilmiah Amerika Serikat tahun 2015 .[3] Ini adalah angsuran keempat dari waralaba Jurassic Park dan yang pertama dalam trilogi Jurassic World. Disutradarai oleh Colin Trevorrow, ditulis oleh Rick Jaffa dan Amanda Silver, bersama Derek Connolly dan Trevorrow, dan diproduksi oleh Frank Marshall dan Patrick Crowley, dan dibintangi oleh Chris Pratt, Bryce Dallas Howard, Vincent D'Onofrio, Ty Simpkins, Nick Robinson, Omar Sy, B. D. Wong, dan Irrfan Khan. Ditetapkan 22 tahun setelah peristiwa Jurassic Park, Jurassic World terjadi di pulau fiksi yang bernama Isla Nublar, yang terletak di lepas pantai Pasifik dari Kosta Rika. taman hiburan kloning dinosaurus yang sukses, dijuluki Dunia Jurassic, telah beroperasi di pulau itu selama bertahun-tahun, membawa impian John Hammond membuahkan hasil. Taman menjadi kacau ketika dinosaurus transgenik melarikan diri dari kandangnya dan mengamuk, sementara konspirasi yang diatur oleh staf taman menciptakan lebih banyak bahaya."
      )

      val itemModel8 = ModelMovie(
         R.drawable.lucy,
         "Lucy",
         "Lucy\" adalah film aksi fiksi ilmiah yang mengikuti kisah Lucy, seorang wanita muda yang secara tidak sengaja terlibat dalam perdagangan narkoba. Setelah menelan dosis obat yang membuatnya dapat menggunakan lebih banyak potensi otaknya, Lucy mulai mengembangkan kemampuan luar biasa seperti telekinesis, manipulasi waktu, dan kecerdasan yang meningkat. Dengan kekuatan barunya, ia berusaha membalas dendam dan mencari cara untuk menggunakan kemampuannya untuk mengubah dunia. Film ini mengangkat tema tentang potensi manusia dan batasan fisik."
      )

      val itemModel9 = ModelMovie(
         R.drawable.spider_man,
         "Spider-man",
         "Spider-Man adalah film superhero yang mengisahkan Peter Parker, seorang remaja yang mendapatkan kekuatan super setelah digigit oleh laba-laba yang terpapar radiasi. Dengan kekuatan ini, ia memutuskan untuk menggunakan kemampuannya untuk melindungi New York City dari berbagai ancaman, termasuk musuh bebuyutannya, seperti Green Goblin dan Doctor Octopus. Cerita ini mengangkat tema tanggung jawab dan pengorbanan, serta perjalanan Peter untuk menyeimbangkan kehidupan sebagai pelajar dan sebagai pahlawan."
      )

      val itemModel10 = ModelMovie(
         R.drawable.hulk,
         "Hulk",
         "Hulk, adalah tokoh pahlawan super fiksi yang ada pada Marvel Comics. DIciptakan oleh Stan Lee dan Jack Kirby, tokoh ini pertama kali muncul di The Incredible Hulk pada tanggal 1 Mei 1962 . Pada tahun 2008, majalah Wizard memberikan julukan kepada Hulk sebagai tokoh dari ketujuh Marvel Comics terhebat[3] Empire Magazine menamakannya sebagai keempat belas tokoh komik dan rangking lima terbesar dari Marvel.[4]"
      )


      val itemList: ArrayList<ModelMovie> = ArrayList()
      itemList.add(itemModel1)
      itemList.add(itemModel2)
      itemList.add(itemModel3)
      itemList.add(itemModel4)
      itemList.add(itemModel5)
      itemList.add(itemModel6)
      itemList.add(itemModel7)
      itemList.add(itemModel8)
      itemList.add(itemModel9)
      itemList.add(itemModel10)

      return itemList
   }
}