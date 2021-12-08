package com.example.finalproject.data

object HeroData {

    // Pahlawan Ri Yg Berjuang Unt Kemerdekaan
    private val nameIndependenceHero = arrayOf(
        "Sultan Hasanuddin",
        "Nyi Ageng Serang",
        "Kapitan Pattimura",
        "Tuanku Imam Bonjol",
        "Pangeran Diponegoro",
        "Martha Kristina Tiahahu",
        "Sri Susuhunan Pakubuwono VI",
        "Pangeran Antasari",
        "Sultan Thaha Syarifuddin",
        "Teungku Cik di Tiro",
        "Abdul Muis",
        "R.M. Soerjoprantono",
        "Sisingamaraja XII"
    )
    private val yearIndependenceHero = arrayOf(
        "1591-1645",
        "1631-1670",
        "1752-1828",
        "1783-1817",
        "1772-1864",
        "1785-1855",
        "unlisted",
        "1807-1848",
        "1809-1862",
        "1816-1904",
        "1836-1891",
        "1883-1959",
        "1871-1959",
        "1849-1907"
    )
    private val descIndepenndenceHero = arrayOf(
        "Sultan Agung adalah pahlawan nasional yang berkuasa di kerajaan Mataram. Sultan Agung merupakan pahlawan Indonesia yang menyerang Belanda saat menguasai beberapa daerah. Sultan Agung melakukan serangan dua kali, pertama tahun 1628 dan mengalami kegagalan, dilanjutkan dengan serangan kedua pada 22 Agustus 1629. Serangan ini menyasar benteng-benteng Belanda.",
        "Sultan Hasanuddin memerintah kerajaan Gowa. Ketika itu, Belanda menguasai perdagangan rempah-rempah di wilayah Gowa. Kerajaan yang dipimpin Sultan Hasanuddin berada di wilayah Timur Indonesia yang menguasai perdagangan. Tahun 1666, Cornelis Speelman dari Belanda berhasil menundukkan kerajaan kecil, namun tidak berhasil menundukkan kerajaan Gowa.",
        "Nyi Ageng Sedang ikut berperang menghadapi Belanda. Dia sempat ditangkap dan dibawa ke Yogyakarta. Kemudian pada 1825-1830, Nyi Ageng Serang bergabung dalam pasukan Diponegoro untuk mempertahankan daerah Prambanan dari Belanda.",
        "Kapitan Pattimura atau Thomas Matulessy melakukan perlawanan di Belanda di Maluku. Perlawanan tersebut terjadi pada 14 Mei 1817. Penyerangan ini membuat Gubernur Belanda Mayor Beetjes, memerintahkan pasukannya untuk merebut kembali benteng tersebut. Pasukan Pattimura sempat berhasil merebut benteng Hoorn. Namun, Belanda kembali menyerang dan menangkap Pattimura.",
        "Peto Syarif atau Tuanku Imam Bonjol melakukan perlawanan terhadap Belanda. Saat itu, Belanda yang memihak kaum adat, sedangkan kaum paderi (kaum agama) berada di bawah kepemimpinan Imam Bonjol. Pada 1824, Belanda ingin berdamai dengan kaum paderi sampai melakukan perjanjian. Tetapi perjanjian tersebut dilanggar oleh Belanda. Selanjutnya, Belanda menyerang Sumatera Barat dan berhasil menguasai desa Bonjol pada 1832 sampai akhirnya daerah tersebut berhasil direbut kembali. Imam Bonjol diserbu dan ditangkap Belanda pada 16 Agustus 1837. Pahlawan Indonesia ini diasingkan ke Cianjur lalu ke Ambon.",
        "Pangeran Diponegoro lahir pada 11 November 1785 di Yogyakarta. Pangeran Diponegoro adalah putera Sultan Hamengkubuwono II yang tidak setuju dengan campur tangan Belanda. Pangeran Diponegoro melakukan perlawanan terhadap Belanda sampai akhirnya Belanda menyerang di kediamannya pada 20 Juli 1825. Namun, pangeran Diponegoro ditangkap oleh Belanda dan dibuang ke Manado.",
        "Martha Kristina Tiahahu adalah gadis kelahiran Nusa Laut Kepulauan Maluku. Dia adalah putri sulung Kapitan Paulus Tiahahu. Dia meneruskan perjuangan ayahnya untuk mengumpulkan pasukan dan menyusun kekuatan demi mengalahkan Belanda. Tetapi, pahlawan Indonesia ini berhasil ditangkap oleh Belanda bersama 39 orang lain. Mereka diangkut ke pulau Jawa dan dipaksa bekerja di perkebunan kopi.",
        "Raden Mas Sapardan atau Pakubuwono VI, lahir di Surakarta pada 26 April 1807. Pakubuwono VI menjadi raja di tahun 1823, ketika itu pemerintah Belanda terlalu banyak ikut campur soal kerajaan. Kemudian tahun 1825-1830 Pangeran Diponegoro mengadakan pemberontakan melawan Belanda. Pakubuwono VI kemudian mengadakan pertemuan dan mengirim bantuan pasukan pada Diponegoro. Belanda menganggap kedua bangsawan ini berbahaya dan harus dipecah belah. Pakubuwono Vi ditangkap Belanda karena meninggalkan istana selama beberapa hari.",
        "Pangeran Antasari adalah keluarga kesultanan Banjarmasin. Dia melakukan perlawanan terhadap pasukan Belanda dan mengusirnya dari kesultanan Banjar. Pada 18 April 1859, terjadi perang Banjar yang dipimpin Pangeran Antasari. Perang ini berlangsung selama 14 tahun. Daerah pertempuran melawan Belanda termasuk Kalimantan Selatan dan Kalimantan Tengah. Tahun 1862, Pangeran Antasari berencana melakukan serangan besar-besaran. Namun, ada wabah cacar yang menular di Kalimantan Selatan sampai Pangeran Antasari ikut terserang. Alhasil rencana perang gagal.",
        "Sultan Thaha Syaifuddin lahir di Keraton Tanah Pilih, Kampung Gedang, Jambi. Pahlawan Indonesia ini melakukan pertempuran di Sungai Aro. Sultan Thaha bersama panglimanya juga sempat bersembunyi dari kejaran Belanda.",
        "Pahlawan Indonesia satu ini dikenal juga sebagai Muhammad Saman, pahlawan dari Aceh. Teungku Cik di Tiro ikut dalam perang Sabil yaitu perang yang menduduki wilayah-wilayah yang dikuasai Belanda. Berkat perjuangannya, wilayah-wilayah yang dikuasai Belanda kemudian berhasil direbut ke tangan Cik di Tiro.",
        "Abdul Muis merupakan pahlawan Indonesia yang berprofesi sebagai sastrawan, politikus dan wartawan Indonesia. Dia pernah menjadi pengurus organisasi Sarekat Islam. Abdul Muis juga menulis karangan yang menangkis penghinaan terhadap bangsanya di harian De Express tahun 1916.",
        "R.M. Suryopranoto merupakan pejuang dan pembela rakyat prbumi melawan penjajah. Pahlawan Indonesia satu ini dikenal sebagai pemimpin pemogokan buruh dan menentang kebijakan pemerintah Belanda. Raden Mas Soerjopranoto mendirikan organisasi Personeel Fabriek Bond (PFB). Organisasi itu terdiri dari kalangan buruh, kumpulan petani dan koperasi.",
        "Sisingamaraja XII melakukan pahlawan Indonesia yang melakukan perlawanan terhadap kekuasaan Belanda, di Tapanuli, Sumatera Utara. Tahun 1877, bersama rakyatnya dia berperang melawan Belanda. Perlawanan dimulai dari Bahal Batu, Humbang, sampai Singkil Aceh."
    )

    private val imgIndependenceHero = arrayOf(
        "https://upload.wikimedia.org/wikipedia/commons/6/65/Portrait_of_Sultan_Agung_Anyakrakusuma.png",
        "https://upload.wikimedia.org/wikipedia/commons/1/14/Ageng_Serang.jpg",
        "https://cdns.klimg.com/merdeka.com/i/w/tokoh/2012/03/15/4595/200x300/kapitan-pattimura.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/3/37/Imam_Bonjol_in_5000_IDR.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/2/2c/Diponegoro.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/c/cd/Martha_Christina_Tiahahu_1999_Indonesia_stamp.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/5/53/Sri_Susuhunan_Pakubuwono_VI.jpg",
        "https://img-z.okeinfo.net/okz/500/library/images/2020/10/11/zzrk8k4yqv4j0sser6mw_13297.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/2/24/Sultan_Thaha_Syaifuddin.jpg",
        "https://cdns.klimg.com/merdeka.com/i/w/tokoh/2012/03/15/4597/200x300/teuku-tjik-ditiro.jpg",
        "https://alchetron.com/cdn/abdul-muis-b8357764-56c9-47ad-8651-a0de1347236-resize-750.jpeg",
        "https://cdns.klimg.com/merdeka.com/i/w/tokoh/2012/03/15/4547/200x300/surjopranoto.jpg",
        "https://alchetron.com/cdn/sisingamangaraja-xii-415383d2-a27a-435e-82e6-20bc3996e2b-resize-750.jpeg"
    )

    val listIndependenceHero: ArrayList<Hero>
        get() {
            val listIndependenceHero = arrayListOf<Hero>()
            for (position in nameIndependenceHero.indices) {
                val hero = Hero(
                    name = nameIndependenceHero[position],
                    year = yearIndependenceHero[position],
                    desc = descIndepenndenceHero[position],
                    image = imgIndependenceHero[position]
                )
                listIndependenceHero.add(hero)
            }
            return listIndependenceHero
        }
}