package com.example.myrecyclerview

object EnhypenData {
    private val data = arrayOf(
        arrayOf(
            "Jay",
             "Nama Panggung: Jay\n" +
                     "Nama Lahir: Jay Park\n" +
                     "Nama Korea: Park Jong Seong\n" +
                     "Tempat Lahir: Seattle, Washington, AS\n" +
                     "Tanggal lahir: 20 April 2002\n" +
                     "Zodiak: Aries\n" +
                     "Tinggi Badan: 180 cm\n" +
                     "Golongan Darah: B\n" +
                     "Kebangsaan: Korea-Amerika\n" +
                     "Pendidikan: Hanlim Multi Art School",
            "https://www.viv.co.id/uploads/large/e5a9e77e9300bc64037f7b4b3a6d2af9.png"
        ),
        arrayOf(
            "Heeseung",
            "Nama Panggung: Heeseung\n" +
                    "Nama Lengkap: Lee Hee Seung\n" +
                    "Posisi: Vokal, Rap, Dancer, Center\n" +
                    "Tanggal Lahir: 15 Oktober 2001\n" +
                    "Zodiak: Libra\n" +
                    "Tinggi: 179 cm\n" +
                    "Golongan Darah: A\n" +
                    "Kewarganegaraan: Korea",
            "https://pbs.twimg.com/media/FpO9vPFaEAABvUX.jpg:large"
        ),
        arrayOf(
            "Sunghoon",
            "Nama Panggung: Sunghoon\n" +
                    "Nama Lahir: Park Sung Hoon\n" +
                    "Tempat Lahir: Namyangju, Gyeonggi, Korea Selatan\n" +
                    "Tanggal Lahir: 8 Desember 2002\n" +
                    "Zodiak: Sagitarius\n" +
                    "Tinggi Badan: 181 cm\n" +
                    "Golongan Darah: O\n" +
                    "Kebangsaan: Korea\n" +
                    "Pendidikan: Pangok High School",
            "https://kpopping.com/documents/51/4/231128-ENHYPEN-Sunghoon-MAMA-2023-documents-1.jpeg?v=2847b"
        ),
        arrayOf(
            "Jake",
            "Nama Panggung: Jake\n" +
                    "Nama Lahir: Jake Shim\n" +
                    "Nama Korea: Shim Jae Yun\n" +
                    "Tempat Lahir: Seoul, Korea Selatan\n" +
                    "Tanggal Lahir: 15 November 2002\n" +
                    "Zodiak: Scorpio\n" +
                    "Tinggi Badan: 175 cm\n" +
                    "Golongan Darah: O\n" +
                    "Kebangsaan: Korea-Australia\n" +
                    "Pendidikan: Dwight School Seoul",
            "https://cdns.klimg.com/resized/670x/g/s/e/sering_dikira_blasteran_wajah_jake_enhypen_dianggap_miliki_perpaduan_yang_terbaik/p/jake_sim_enhypen-20230815-002-non_fotografer_kly.jpg"
        ),
        arrayOf(
            "Sunoo",
            "Nama Panggung: Sunoo\n" +
                    "Nama Lahir: Kim Seon Woo\n" +
                    "Tempat Lahir: Suwon, Gyeonggi, Korea Selatan\n" +
                    "Tanggal Lahir: 24 Juni 2003\n" +
                    "Zodiak: Cancer\n" +
                    "Tinggi Badan: 177 cm\n" +
                    "Golongan Darah: O\n" +
                    "Kebangsaan: Korea\n" +
                    "Pendidikan: Sekolah Menengah Chilbo, Sekolah Menengah Chilbo, Hanlim Multi Art School",
            "https://kpopping.com/documents/2b/5/231128-ENHYPEN-Sunoo-MAMA-2023-documents-1.jpeg?v=62c32"
        ),
        arrayOf(
            "Niki",
            "Nama Panggung: Ni-Ki\n" +
                    "Nama Lahir: Nishimura Riki\n" +
                    "Tempat Lahir: Okayama, Jepang\n" +
                    "Tanggal Lahir: 9 Desember 2005\n" +
                    "Zodiak: Sagitarius\n" +
                    "Tinggi Badan: 181 cm (5’11”)\n" +
                    "Berat Badan: 63 kg (138,8 lbs)\n" +
                    "Golongan Darah: B\n" +
                    "Kebangsaan: Jepang",
            "https://cdns.diadona.id/diadona.id/resources/photonews/2021/12/10/54601/664xauto-genap-berusia-16-tahun-ini-pesona-niki-enhypen-si-golden-maknae-yang-jago-nari-211210u-005.jpg"
        ),
        arrayOf(
            "Jungwon",
            "Nama Panggung: Jungwon\n" +
                    "Nama Lahir: Yang Jung Won\n" +
                    "Tanggal Lahir: 9 Februari 2004\n" +
                    "Zodiak: Aquarius\n" +
                    "Tinggi Badan: 175 cm\n" +
                    "Golongan Darah: AB\n" +
                    "MBTI: ESTJ\n" +
                    "Kebangsaan: Korea\n" +
                    "Pendidikan: Namgang High School, Hanlim Multi Art School.",
            "https://pbs.twimg.com/media/F4rqSgMaUAA6Vc7.jpg:large"
        )
    )

    val listData: ArrayList<Enhypen>
        get() {
            val list = arrayListOf<Enhypen>()
            for (aData in data){
                val enhypen = Enhypen()
                enhypen.name = aData [0]
                enhypen.from = aData [1]
                enhypen.photo = aData [2]

                list.add(enhypen)
            }
            return list
        }
}