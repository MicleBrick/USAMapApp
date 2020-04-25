package com.github.miclebrick.usamapapp

import android.graphics.Point
import android.graphics.Rect

enum class State(
    val nameRect: Rect,
    val viewPoint: Point,
    val youtubeId: String,
    val population: String,
    val capital: String
) {
    Alabama(
        nameRect = Rect(534, 399, 575, 407),
        viewPoint = Point(550, 400),
        youtubeId = "sBtTter1Cmk",
        population = "4.87 million",
        capital = "Montgomery"
    ),
    Arizona(
        nameRect = Rect(150, 361, 185, 368),
        viewPoint = Point(165, 365),
        youtubeId = "t7etNRVGXag",
        population = "7.02 million",
        capital = "Phoenix"
    ),
    Arkansas(
        nameRect = Rect(444, 366, 485, 374),
        viewPoint = Point(460, 370),
        youtubeId = "A_2gLmuPkJg",
        population = "3 million",
        capital = "Little Rock"
    ),
    California(
        nameRect = Rect(34, 286, 77, 294),
        viewPoint = Point(50, 290),
        youtubeId = "uw6rz_LiTzU",
        population = "39.54 million",
        capital = "Sacramento"
    ),
    Colorado(
        nameRect = Rect(253, 284, 295, 292),
        viewPoint = Point(270, 290),
        youtubeId = "D5Raubb1LWA",
        population = "5.61 million",
        capital = "Denver"
    ),
    Connecticut(
        nameRect = Rect(718, 209, 766, 215),
        viewPoint = Point(728, 205),
        youtubeId = "iPayvEJeBTk",
        population = "3.59 million",
        capital = "Hartford"
    ),
    Delaware(
        nameRect = Rect(699, 258, 800, 566),
        viewPoint = Point(700, 265),
        youtubeId = "L05ONfpJGvE",
        population = "0.96 million",
        capital = "Dover"
    ),
    Florida(
        nameRect = Rect(631, 468, 662, 476),
        viewPoint = Point(640, 475),
        youtubeId = "OZHen61iV_c",
        population = "21.67 million",
        capital = "Tallahassee"
    ),
    Georgia(
        nameRect = Rect(594, 396, 630, 406),
        viewPoint = Point(600, 400),
        youtubeId = "hWxAeRnpDns",
        population = "10.43 million",
        capital = "Atlanta"
    ),
    Idaho(
        nameRect = Rect(144, 166, 170, 174),
        viewPoint = Point(160, 180),
        youtubeId = "gnONYpms2Q0",
        population = "1.72 million",
        capital = "Boise"
    ),
    Illinois(
        nameRect = Rect(489, 268, 517, 276),
        viewPoint = Point(500, 275),
        youtubeId = "hQnTjWo21Ak",
        population = "12.8 million",
        capital = "Springfield"
    ),
    Indiana(
        nameRect = Rect(534, 267, 568, 275),
        viewPoint = Point(550, 270),
        youtubeId = "MOQox8ol2G8",
        population = "6.67 million",
        capital = "Indianapolis"
    ),
    Iowa(
        nameRect = Rect(437, 235, 458, 242),
        viewPoint = Point(440, 240),
        youtubeId = "TncR2MS18wk",
        population = "3.15 million",
        capital = "Des Moines"
    ),
    Kansas(
        nameRect = Rect(360, 300, 391, 308),
        viewPoint = Point(370, 300),
        youtubeId = "3gEmSa0esDs",
        population = "2.91 million",
        capital = "Topeka"
    ),
    Kentucky(
        nameRect = Rect(558, 309, 601, 319),
        viewPoint = Point(570, 310),
        youtubeId = "3gEmSa0esDs",
        population = "4.45 million",
        capital = "Frankfort"
    ),
    Louisiana(
        nameRect = Rect(451, 444, 495, 453),
        viewPoint = Point(460, 440),
        youtubeId = "IZTSj0u5hZo",
        population = "4.65 million",
        capital = "Baton Rouge"
    ),
    Maine(
        nameRect = Rect(747, 128, 775, 137),
        viewPoint = Point(750, 130),
        youtubeId = "nm2kZHa41nY",
        population = "1.34 million",
        capital = "Augusta"
    ),
    Maryland(
        nameRect = Rect(655, 252, 699, 262),
        viewPoint = Point(680, 260),
        youtubeId = "DmczFUDKYb0",
        population = "6.05 million",
        capital = "Annapolis"
    ),
    Massachusetts(
        nameRect = Rect(718, 187, 787, 195),
        viewPoint = Point(735, 190),
        youtubeId = "bOaFTEsDHI8",
        population = "6.89 million",
        capital = "Boston"
    ),
    Michigan(
        nameRect = Rect(539, 199, 581, 209),
        viewPoint = Point(560, 210),
        youtubeId = "jxC0735hZwU",
        population = "9.99 million",
        capital = "Lansing"
    ),
    Minnesota(
        nameRect = Rect(409, 156, 459, 164),
        viewPoint = Point(425, 165),
        youtubeId = "jxC0735hZwU",
        population = "5.64 million",
        capital = "Saint Paul"
    ),
    Mississippi(
        nameRect = Rect(483, 394, 533, 404),
        viewPoint = Point(500, 400),
        youtubeId = "W6H58RFao2c",
        population = "2.98 million",
        capital = "Jackson"
    ),
    Missouri(
        nameRect = Rect(444, 303, 483, 311),
        viewPoint = Point(450, 300),
        youtubeId = "YqHVHU6xGmw",
        population = "6.14 million",
        capital = "Jefferson City"
    ),
    Montana(
        nameRect = Rect(223, 128, 264, 137),
        viewPoint = Point(230, 130),
        youtubeId = "YqHVHU6xGmw",
        population = "1.07 million",
        capital = "Helena"
    ),
    Nebraska(
        nameRect = Rect(334, 245, 377, 253),
        viewPoint = Point(350, 250),
        youtubeId = "QULWibKTrFM",
        population = "1.93 million",
        capital = "Lincoln"
    ),
    Nevada(
        nameRect = Rect(98, 261, 133, 269),
        viewPoint = Point(110, 260),
        youtubeId = "ILZpOQ9CCZs",
        population = "3.08 million",
        capital = "Carson City"
    ),
    NewHampshire(
        nameRect = Rect(728, 168, 790, 177),
        viewPoint = Point(730, 160),
        youtubeId = "v1rJ6-YWe2o",
        population = "1.36 million",
        capital = "Concord"
    ),
    NewJersey(
        nameRect = Rect(704, 234, 757, 245),
        viewPoint = Point(710, 240),
        youtubeId = "YkYbLuG443U",
        population = "8.88 million",
        capital = "Trenton"
    ),
    NewMexico(
        nameRect = Rect(231, 368, 289, 377),
        viewPoint = Point(250, 370),
        youtubeId = "fVe8CLPdocQ",
        population = "2.097 million",
        capital = "Santa Fe"
    ),
    NewYork(
        nameRect = Rect(663, 188, 707, 197),
        viewPoint = Point(690, 190),
        youtubeId = "aCIxwk7dwA8",
        population = "19.45 million",
        capital = "Albany"
    ),
    NorthCarolina(
        nameRect = Rect(630, 333, 699, 341),
        viewPoint = Point(660, 340),
        youtubeId = "ekLtTY0MOzY",
        population = "10.49 million",
        capital = "Raleigh"
    ),
    NorthDakota(
        nameRect = Rect(327, 132, 389, 141),
        viewPoint = Point(350, 140),
        youtubeId = "96l3kYt_T5o",
        population = "762,062",
        capital = "Bismarck"
    ),
    Ohio(
        nameRect = Rect(586, 254, 608, 262),
        viewPoint = Point(600, 260),
        youtubeId = "9Ziq6PDcKNI",
        population = "11.69 million",
        capital = "Columbus"
    ),
    Oklahoma(
        nameRect = Rect(370, 354, 418, 363),
        viewPoint = Point(390, 360),
        youtubeId = "AVVSP9Kl50U",
        population = "3.96 million",
        capital = "Oklahoma City"
    ),
    Oregon(
        nameRect = Rect(62, 157, 98, 168),
        viewPoint = Point(80, 160),
        youtubeId = "-UsrYdMIikY",
        population = "4.22 million",
        capital = "Salem"
    ),
    Pennsylvania(
        nameRect = Rect(630, 232, 691, 242),
        viewPoint = Point(660, 240),
        youtubeId = "-UsrYdMIikY",
        population = "12.8 million",
        capital = "Harrisburg"
    ),
    RhodeIsland(
        nameRect = Rect(744, 199, 794, 206),
        viewPoint = Point(740, 200),
        youtubeId = "LlFS5ffgKKQ",
        population = "1.06 million",
        capital = "Providence"
    ),
    SouthCarolina(
        nameRect = Rect(617, 366, 686, 375),
        viewPoint = Point(640, 370),
        youtubeId = "JmhK2mcge-E",
        population = "5.15 million",
        capital = "Columbia"
    ),
    SouthDakota(
        nameRect = Rect(327, 189, 390, 197),
        viewPoint = Point(350, 190),
        youtubeId = "-xIUwPPID8A",
        population = "884,659",
        capital = "Pierre"
    ),
    Tennessee(
        nameRect = Rect(527, 342, 576, 350),
        viewPoint = Point(550, 350),
        youtubeId = "-xIUwPPID8A",
        population = "6.83 million",
        capital = "Nashville"
    ),
    Texas(
        nameRect = Rect(337, 431, 363, 439),
        viewPoint = Point(350, 430),
        youtubeId = "2Jpgd8yKpUI",
        population = "29 million",
        capital = "Austin"
    ),
    Utah(
        nameRect = Rect(176, 266, 197, 275),
        viewPoint = Point(190, 270),
        youtubeId = "pxrkCijGKvA",
        population = "3.21 million",
        capital = "Salt Lake City"
    ),
    Vermont(
        nameRect = Rect(695, 147, 736, 156),
        viewPoint = Point(715, 165),
        youtubeId = "K_Yg-OJ-ris",
        population = "623,989",
        capital = "Montpelier"
    ),
    Virginia(
        nameRect = Rect(650, 295, 686, 305),
        viewPoint = Point(660, 300),
        youtubeId = "2w6hHDaA03M",
        population = "8.54 million",
        capital = "Richmond"
    ),
    Washington(
        nameRect = Rect(87, 92, 144, 104),
        viewPoint = Point(100, 100),
        youtubeId = "AZGUKndD79Y",
        population = "7.62 million",
        capital = "Olympia"
    ),
    WestVirginia(
        nameRect = Rect(599, 281, 660, 291),
        viewPoint = Point(625, 290),
        youtubeId = "MSO3JwIlDl0",
        population = "1.79 million",
        capital = "Charleston"
    ),
    Wisconsin(
        nameRect = Rect(466, 184, 514, 193),
        viewPoint = Point(490, 190),
        youtubeId = "uZ3G2cjmZSc",
        population = "5.82 million",
        capital = "Madison"
    ),
    Wyoming(
        nameRect = Rect(234, 207, 278, 218),
        viewPoint = Point(250, 210),
        youtubeId = "tY6n7cxeLss",
        population = "578,759",
        capital = "Cheyenne"
    );
}