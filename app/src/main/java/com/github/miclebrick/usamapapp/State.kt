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
            Population: 4.87 million (2017)
            Area: 52,419 sq miles
            Capital: Montgomery
        """.trimIndent()
    ),
    Arizona(
        nameRect = Rect(150, 361, 185, 368),
        viewPoint = Point(165, 365),
        youtubeLink = "https://youtu.be/t7etNRVGXag",
        details = """
            Population: 7.02 million (2017)
            Area: 113,998 sq miles
            Capital: Phoenix
        """.trimIndent()
    ),
    Arkansas(
        nameRect = Rect(444, 366, 485, 374),
        viewPoint = Point(460, 370),
        youtubeLink = "https://youtu.be/A_2gLmuPkJg",
        details = """
            Population: 3 million (2017)
            Area: 53,179 sq miles
            Capital: Little Rock
        """.trimIndent()
    ),
    California(
        nameRect = Rect(34, 286, 77, 294),
        viewPoint = Point(50, 290),
        youtubeLink = "https://youtu.be/uw6rz_LiTzU",
        details = """
            Population: 39.54 million (2017)
            Area: 163,696 sq miles
            Capital: Sacramento
        """.trimIndent()
    ),
    Colorado(
        nameRect = Rect(253, 284, 295, 292),
        viewPoint = Point(270, 290),
        youtubeLink = "https://youtu.be/D5Raubb1LWA",
        details = """
            Population: 5.61 million (2017)
            Area: 104,185 sq miles
            Capital: Denver
        """.trimIndent()
    ),
    Connecticut(
        nameRect = Rect(718, 209, 766, 215),
        viewPoint = Point(728, 205),
        youtubeLink = "https://youtu.be/iPayvEJeBTk",
        details = """
            Population: 3.59 million (2017)
            Area: 5,543 sq miles
            Capital: Hartford
        """.trimIndent()
    ),
    Delaware(
        nameRect = Rect(699, 258, 800, 566),
        viewPoint = Point(700, 265),
        youtubeLink = "https://youtu.be/L05ONfpJGvE",
        details = """
            Population: 0.96 million (2017)
            Area: 2,491 sq miles
            Capital: Dover
        """.trimIndent()
    ),
    Florida(
        nameRect = Rect(631, 468, 662, 476),
        viewPoint = Point(640, 475),
        youtubeLink = "https://youtu.be/OZHen61iV_c",
        details = """
            Population: 21.67 million (2019)
            Area: 65,755 sq miles
            Capital: Tallahassee
        """.trimIndent()
    ),
    Georgia(
        nameRect = Rect(594, 396, 630, 406),
        viewPoint = Point(600, 400),
        youtubeLink = "https://youtu.be/hWxAeRnpDns",
        details = """
            Population: 10.43 million (2017)
            Area: 59,425 sq miles
            Capital: Atlanta
        """.trimIndent()
    ),
    Idaho(
        nameRect = Rect(144, 166, 170, 174),
        viewPoint = Point(160, 180),
        youtubeLink = "https://youtu.be/gnONYpms2Q0",
        details = """
            Population: 1.72 million (2017)
            Area: 83,642 sq miles
            Capital: Boise
        """.trimIndent()
    ),
    Illinois(
        nameRect = Rect(489, 268, 517, 276),
        viewPoint = Point(500, 275),
        youtubeLink = "https://youtu.be/hQnTjWo21Ak",
        details = """
            Population: 12.8 million (2017)
            Area: 57,915 sq miles
            Capital: Springfield
        """.trimIndent()
    ),
    Indiana(
        nameRect = Rect(534, 267, 568, 275),
        viewPoint = Point(550, 270),
        youtubeLink = "https://youtu.be/MOQox8ol2G8",
        details = """
            Population: 6.67 million (2017)
            Area: 36,418 sq miles
            Capital: Indianapolis
        """.trimIndent()
    ),
    Iowa(
        nameRect = Rect(437, 235, 458, 242),
        viewPoint = Point(440, 240),
        youtubeLink = "https://youtu.be/TncR2MS18wk",
        details = """
            Population: 3.15 million (2017)
            Area: 56,272 sq miles
            Capital: Des Moines
        """.trimIndent()
    ),
    Kansas(
        nameRect = Rect(360, 300, 391, 308),
        viewPoint = Point(370, 300),
        youtubeLink = "https://youtu.be/3gEmSa0esDs",
        details = """
            Population: 2.91 million (2017)
            Area: 82,277 sq miles
            Capital: Topeka
        """.trimIndent()
    ),
    Kentucky(
        nameRect = Rect(558, 309, 601, 319),
        viewPoint = Point(570, 310),
        youtubeLink = "https://youtu.be/3gEmSa0esDs",
        details = """
            Population: 4.45 million (2017)
            Area: 40,409 sq miles
            Capital: Frankfort
        """.trimIndent()
    ),
    Louisiana(
        nameRect = Rect()
    ),
    Maine,
    Maryland,
    Massachusetts,
    Michigan,
    Minnesota,
    Mississippi,
    Missouri,
    Montana,
    Nebraska,
    Nevada,
    NewHampshire,
    NewJersey,
    NewMexico,
    NewYork,
    NorthCarolina,
    NorthDakota,
    Ohio,
    Oklahoma,
    Oregon,
    Pennsylvania,
    RhodeIsland,
    SouthCarolina,
    SouthDakota,
    Tennessee,
    Texas,
    Utah,
    Vermont,
    Virginia,
    Washington,
    WestVirginia,
    Wisconsin,
    Wyoming;
}