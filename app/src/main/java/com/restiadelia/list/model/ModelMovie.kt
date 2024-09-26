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
         R.drawable.batman,
         "Batman",
         "Batman (manusia kelelawar) adalah tokoh pahlawan super fiksi yang diciptakan oleh seniman Bob Kane dan penulis Bill Finger[1][2] dan diterbitkan oleh DC Comics. Tokoh ini pertama muncul di Detective Comics #27 (Mei 1939). Identitas asli Batman adalah Bruce Wayne, seorang pengusaha yang kaya raya. Nama Bruce Wayne itu sendiri diambil dari nama tokoh sejarah, yaitu Robert the Bruce dan Anthony Wayne.[6]"
      )

      val itemModel3 = ModelMovie(
         R.drawable.end_game,
         "End Game",
         "Avengers: Endgame adalah film pahlawan super Amerika tahun 2019 yang berdasarkan kisah tim pahlawan super Avengers dari Marvel Comics. Film yang diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures ini adalah sekuel langsung Avengers: Infinity War (2018) dan merupakan film ke-22 Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Anthony dan Joe Russo dan ditulis oleh Christopher Markus dan Stephen McFeely, dan menampilkan pemeran ensambel di antaranya Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth, Scarlett Johansson, Jeremy Renner, Don Cheadle, Paul Rudd, Brie Larson, Karen Gillan, Danai Gurira, Benedict Wong, Jon Favreau, Bradley Cooper, Gwyneth Paltrow, dan Josh Brolin. Pada film ini, anggota Avengers yang masih hidup dan para sekutunya berusaha untuk membalikkan kerusakan yang disebabkan oleh Thanos dalam Infinity War."
      )

      val itemModel4 = ModelMovie(
         R.drawable.hulk,
         "Hulk",
         "Hulk, adalah tokoh pahlawan super fiksi yang ada pada Marvel Comics. DIciptakan oleh Stan Lee dan Jack Kirby, tokoh ini pertama kali muncul di The Incredible Hulk pada tanggal 1 Mei 1962 . Pada tahun 2008, majalah Wizard memberikan julukan kepada Hulk sebagai tokoh dari ketujuh Marvel Comics terhebat[3] Empire Magazine menamakannya sebagai keempat belas tokoh komik dan rangking lima terbesar dari Marvel.[4]"
      )

      val itemModel5 = ModelMovie(
         R.drawable.inception,
         "Inception",
         "Inception (2010) Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing valuable secrets from deep within the subconscious during the dream state, when the mind is at its most vulnerable. Cobb's rare ability has made him a coveted player in this treacherous new world of corporate espionage, but it has also made him an international fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at redemption. One last job could give him his life back but only if he can accomplish the impossible, inception. Instead of the perfect heist, Cobb and his team of specialists have to pull off the reverse: their task is not to steal an idea, but to plant one. If they succeed, it could be the perfect crime. But no amount of careful planning or expertise can prepare the team for the dangerous enemy that seems to predict their every move. An enemy that only Cobb could have seen coming. ??Warner Bros. Pictures"
      )

      val itemModel6 = ModelMovie(
         R.drawable.jumanji,
         "Jumanji",
         "Jumanji: Welcome to the Jungle (2017) In a brand-new Jumanji adventure, four high-school kids discover an old video-game console and are drawn into the game's jungle setting, literally becoming the adult avatars they chose. What they discover is that you don't just play Jumanji--you must survive it. To beat the game and return to the real world, they must go on the most dangerous adventure of their lives, discover what Alan Parrish left 20 years ago, and change the way they think about themselves --or they'll be stuck in the game forever, to be played by others without break. ??Sony Pictures"
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
         R.drawable.venom,
         "Venom",
         "Venom adalah film yang berfokus pada Eddie Brock, seorang jurnalis yang terinfeksi oleh simbiote alien bernama Venom. Setelah terhubung dengan Venom, Eddie mendapatkan kekuatan super, tetapi juga harus menghadapi konflik batin dan ancaman dari musuh yang berbahaya. Film ini mengeksplorasi hubungan antara Eddie dan Venom, serta perjuangan Eddie untuk menjadi pahlawan meskipun dengan cara yang tidak konvensional. Tema utama film ini mencakup identitas dan konflik moral."
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