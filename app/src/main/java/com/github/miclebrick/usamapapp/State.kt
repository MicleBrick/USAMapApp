package com.github.miclebrick.usamapapp

import android.graphics.Point
import android.graphics.Rect

enum class State(
    val nameRect: Rect,
    val viewPoint: Point,
    val youtubeLink: String,
    val details: String
) {
    Alabama(
        nameRect = Rect(534, 399, 575, 407),
        viewPoint = Point(550, 400),
        youtubeLink = "https://youtu.be/sBtTter1Cmk",
        details = """
            Population: 4.87 million
            Capital: Montgomery
        """.trimIndent()
    ),
    Arizona(
        nameRect = Rect(150, 361, 185, 368),
        viewPoint = Point(165, 365),
        youtubeLink = "https://youtu.be/t7etNRVGXag",
        details = """
            Population: 7.02 million
            Capital: Phoenix
        """.trimIndent()
    ),
    Arkansas(
        nameRect = Rect(444, 366, 485, 374),
        viewPoint = Point(460, 370),
        youtubeLink = "https://youtu.be/A_2gLmuPkJg",
        details = """
            Population: 3 million
            Capital: Little Rock
        """.trimIndent()
    ),
    California(
        nameRect = Rect(34, 286, 77, 294),
        viewPoint = Point(50, 290),
        youtubeLink = "https://youtu.be/uw6rz_LiTzU",
        details = """
            Population: 39.54 million
            Capital: Sacramento
        """.trimIndent()
    ),
    Colorado(
        nameRect = Rect(253, 284, 295, 292),
        viewPoint = Point(270, 290),
        youtubeLink = "https://youtu.be/D5Raubb1LWA",
        details = """
            Population: 5.61 million
            Capital: Denver
        """.trimIndent()
    ),
    Connecticut(
        nameRect = Rect(718, 209, 766, 215),
        viewPoint = Point(728, 205),
        youtubeLink = "https://youtu.be/iPayvEJeBTk",
        details = """
            Population: 3.59 million
            Capital: Hartford
        """.trimIndent()
    ),
    Delaware(
        nameRect = Rect(699, 258, 800, 566),
        viewPoint = Point(700, 265),
        youtubeLink = "https://youtu.be/L05ONfpJGvE",
        details = """
            Population: 0.96 million
            Capital: Dover
        """.trimIndent()
    ),
    Florida(
        nameRect = Rect(631, 468, 662, 476),
        viewPoint = Point(640, 475),
        youtubeLink = "https://youtu.be/OZHen61iV_c",
        details = """
            Population: 21.67 million
            Capital: Tallahassee
        """.trimIndent()
    ),
    Georgia(
        nameRect = Rect(594, 396, 630, 406),
        viewPoint = Point(600, 400),
        youtubeLink = "https://youtu.be/hWxAeRnpDns",
        details = """
            Population: 10.43 million
            Capital: Atlanta
        """.trimIndent()
    ),
    Idaho(
        nameRect = Rect(144, 166, 170, 174),
        viewPoint = Point(160, 180),
        youtubeLink = "https://youtu.be/gnONYpms2Q0",
        details = """
            Population: 1.72 million
            Capital: Boise
        """.trimIndent()
    ),
    Illinois(
        nameRect = Rect(489, 268, 517, 276),
        viewPoint = Point(500, 275),
        youtubeLink = "https://youtu.be/hQnTjWo21Ak",
        details = """
            Population: 12.8 million
            Capital: Springfield
        """.trimIndent()
    ),
    Indiana(
        nameRect = Rect(534, 267, 568, 275),
        viewPoint = Point(550, 270),
        youtubeLink = "https://youtu.be/MOQox8ol2G8",
        details = """
            Population: 6.67 million
            Capital: Indianapolis
        """.trimIndent()
    ),
    Iowa(
        nameRect = Rect(437, 235, 458, 242),
        viewPoint = Point(440, 240),
        youtubeLink = "https://youtu.be/TncR2MS18wk",
        details = """
            Population: 3.15 million
            Capital: Des Moines
        """.trimIndent()
    ),
    Kansas(
        nameRect = Rect(360, 300, 391, 308),
        viewPoint = Point(370, 300),
        youtubeLink = "https://youtu.be/3gEmSa0esDs",
        details = """
            Population: 2.91 million
            Capital: Topeka
        """.trimIndent()
    ),
    Kentucky(
        nameRect = Rect(558, 309, 601, 319),
        viewPoint = Point(570, 310),
        youtubeLink = "https://youtu.be/3gEmSa0esDs",
        details = """
            Population: 4.45 million
            Capital: Frankfort
        """.trimIndent()
    ),
    Louisiana(
        nameRect = Rect(451, 444, 495, 453),
        viewPoint = Point(460, 440),
        youtubeLink = "https://youtu.be/IZTSj0u5hZo",
        details = """
            Population: 4.65 million
            Capital: Baton Rouge
        """.trimIndent()
    ),
    Maine(
        nameRect = Rect(747, 128, 775, 137),
        viewPoint = Point(750, 130),
        youtubeLink = "https://youtu.be/nm2kZHa41nY",
        details = """
            Population: 1.34 million
            Capital: Augusta
        """.trimIndent()
    ),
    Maryland(
        nameRect = Rect(655, 252, 699, 262),
        viewPoint = Point(680, 260),
        youtubeLink = "https://youtu.be/DmczFUDKYb0",
        details = """
            Population: 6.05 million
            Capital: Annapolis
        """.trimIndent()
    ),
    Massachusetts(
        nameRect = Rect(718, 187, 787, 195),
        viewPoint = Point(735, 190),
        youtubeLink = "https://youtu.be/bOaFTEsDHI8",
        details = """
            Population: 6.89 million
            Capital: Boston
        """.trimIndent()
    ),
    Michigan(
        nameRect = Rect(539, 199, 581, 209),
        viewPoint = Point(560, 210),
        youtubeLink = "https://youtu.be/jxC0735hZwU",
        details = """
            Population: 9.99 million
            Capital: Lansing
        """.trimIndent()
    ),
    Minnesota(
        nameRect = Rect(409, 156, 459, 164),
        viewPoint = Point(425, 165),
        youtubeLink = "https://youtu.be/jxC0735hZwU",
        details = """
            Population: 5.64 million
            Capital: Saint Paul
        """.trimIndent()
    ),
    Mississippi(
        nameRect = Rect(483, 394, 533, 404),
        viewPoint = Point(500, 400),
        youtubeLink = "https://youtu.be/W6H58RFao2c",
        details = """
            Population: 2.98 million
            Capital: Jackson
        """.trimIndent()
    ),
    Missouri(
        nameRect = Rect(444, 303, 483, 311),
        viewPoint = Point(450, 300),
        youtubeLink = "https://youtu.be/YqHVHU6xGmw",
        details = """
            Population: 6.14 million
            Capital: Jefferson City
        """.trimIndent()
    ),
    Montana(
        nameRect = Rect(223, 128, 264, 137),
        viewPoint = Point(230, 130),
        youtubeLink = "https://youtu.be/YqHVHU6xGmw",
        details = """
            Population: 1.07 million
            Capital: Helena
        """.trimIndent()
    ),
    Nebraska(
        nameRect = Rect(334, 245, 377, 253),
        viewPoint = Point(350, 250),
        youtubeLink = "https://youtu.be/QULWibKTrFM",
        details = """
            Population: 1.93 million
            Capital: Lincoln
        """.trimIndent()
    ),
    Nevada(
        nameRect = Rect(98, 261, 133, 269),
        viewPoint = Point(110, 260),
        youtubeLink = "https://youtu.be/ILZpOQ9CCZs",
        details = """
            Population: 3.08 million
            Capital: Carson City
        """.trimIndent()
    ),
    NewHampshire(
        nameRect = Rect(728, 168, 790, 177),
        viewPoint = Point(730, 160),
        youtubeLink = "https://youtu.be/v1rJ6-YWe2o",
        details = """
            Population: 1.36 million
            Capital: Concord
        """.trimIndent()
    ),
    NewJersey(
        nameRect = Rect(704, 234, 757, 245),
        viewPoint = Point(710, 240),
        youtubeLink = "https://youtu.be/YkYbLuG443U",
        details = """
            Population: 8.88 million
            Capital: Trenton
        """.trimIndent()
    ),
    NewMexico(
        nameRect = Rect(231, 368, 289, 377),
        viewPoint = Point(250, 370),
        youtubeLink = "https://youtu.be/fVe8CLPdocQ",
        details = """
            Population: 2.097 million
            Capital: Santa Fe
        """.trimIndent()
    ),
    NewYork(
        nameRect = Rect(663, 188, 707, 197),
        viewPoint = Point(690, 190),
        youtubeLink = "https://youtu.be/aCIxwk7dwA8",
        details = """
            Population: 19.45 million
            Capital: Albany
        """.trimIndent()
    ),
    NorthCarolina(
        nameRect = Rect(630, 333, 699, 341),
        viewPoint = Point(660, 340),
        youtubeLink = "https://youtu.be/ekLtTY0MOzY",
        details = """
            Population: 10.49 million
            Capital: Raleigh
        """.trimIndent()
    ),
    NorthDakota(
        nameRect = Rect(327, 132, 389, 141),
        viewPoint = Point(350, 140),
        youtubeLink = "https://youtu.be/96l3kYt_T5o",
        details = """
            Population: 762,062
            Capital: Bismarck
        """.trimIndent()
    ),
    Ohio(
        nameRect = Rect(586, 254, 608, 262),
        viewPoint = Point(600, 260),
        youtubeLink = "https://youtu.be/9Ziq6PDcKNI",
        details = """
            Population: 11.69 million
            Capital: Columbus
        """.trimIndent()
    ),
    Oklahoma(
        nameRect = Rect(370, 354, 418, 363),
        viewPoint = Point(390, 360),
        youtubeLink = "https://youtu.be/AVVSP9Kl50U",
        details = """
            Population: 3.96 million
            Capital: Oklahoma City
        """.trimIndent()
    ),
    Oregon(
        nameRect = Rect(62, 157, 98, 168),
        viewPoint = Point(80, 160),
        youtubeLink = "https://youtu.be/-UsrYdMIikY",
        details = """
            Population: 4.22 million
            Capital: Salem
        """.trimIndent()
    ),
    Pennsylvania(
        nameRect = Rect(630, 232, 691, 242),
        viewPoint = Point(660, 240),
        youtubeLink = "https://youtu.be/-UsrYdMIikY",
        details = """
            Population: 12.8 million
            Capital: Harrisburg
        """.trimIndent()
    ),
    RhodeIsland(
        nameRect = Rect(744, 199, 794, 206),
        viewPoint = Point(740, 200),
        youtubeLink = "https://youtu.be/LlFS5ffgKKQ",
        details = """
            Population: 1.06 million
            Capital: Providence
        """.trimIndent()
    ),
    SouthCarolina(
        nameRect = Rect(617, 366, 686, 375),
        viewPoint = Point(640, 370),
        youtubeLink = "https://youtu.be/JmhK2mcge-E",
        details = """
            Population: 5.15 million
            Capital: Columbia
        """.trimIndent()
    ),
    SouthDakota(
        nameRect = Rect(327, 189, 390, 197),
        viewPoint = Point(350, 190),
        youtubeLink = "https://youtu.be/-xIUwPPID8A",
        details = """
            Population: 884,659
            Capital: Pierre
        """.trimIndent()
    ),
    Tennessee(
        nameRect = Rect(527, 342, 576, 350),
        viewPoint = Point(550, 350),
        youtubeLink = "https://youtu.be/-xIUwPPID8A",
        details = """
            Population: 6.83 million
            Capital: Nashville
        """.trimIndent()
    ),
    Texas(
        nameRect = Rect(337, 431, 363, 439),
        viewPoint = Point(350, 430),
        youtubeLink = "https://youtu.be/2Jpgd8yKpUI",
        details = """
            Population: 29 million
            Capital: Austin
        """.trimIndent()
    ),
    Utah(
        nameRect = Rect(176, 266, 197, 275),
        viewPoint = Point(190, 270),
        youtubeLink = "https://youtu.be/pxrkCijGKvA",
        details = """
            Population: 3.21 million
            Capital: Salt Lake City
        """.trimIndent()
    ),
    Vermont(
        nameRect = Rect(695, 147, 736, 156),
        viewPoint = Point(715, 165),
        youtubeLink = "https://youtu.be/K_Yg-OJ-ris",
        details = """
            Population: 623,989
            Capital: Montpelier
        """.trimIndent()
    ),
    Virginia(
        nameRect = Rect(650, 295, 686, 305),
        viewPoint = Point(660, 300),
        youtubeLink = "https://youtu.be/2w6hHDaA03M",
        details = """
            Population: 8.54 million
            Capital: Richmond
        """.trimIndent()
    ),
    Washington(
        nameRect = Rect(87, 92, 144, 104),
        viewPoint = Point(100, 100),
        youtubeLink = "https://youtu.be/AZGUKndD79Y",
        details = """
            Population: 7.62 million
            Capital: Olympia
        """.trimIndent()
    ),
    WestVirginia(
        nameRect = Rect(599, 281, 660, 291),
        viewPoint = Point(625, 290),
        youtubeLink = "https://youtu.be/MSO3JwIlDl0",
        details = """
            Population: 1.79 million
            Capital: Charleston
        """.trimIndent()
    ),
    Wisconsin(
        nameRect = Rect(466, 184, 514, 193),
        viewPoint = Point(490, 190),
        youtubeLink = "https://youtu.be/uZ3G2cjmZSc",
        details = """
            Population:
            Capital: 
        """.trimIndent()
    ),
    Wyoming(
        nameRect = Rect(234, 207, 278, 218),
        viewPoint = Point(250, 210),
        youtubeLink = "https://youtu.be/tY6n7cxeLss",
        details = """
            Population: 5.82 million
            Capital: Madison
        """.trimIndent()
    );
}