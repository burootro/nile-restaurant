package com.nile.restaurant.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val NileShapes = Shapes(
    extraSmall = RoundedCornerShape(10.dp),
    small = RoundedCornerShape(13.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(20.dp),
    extraLarge = RoundedCornerShape(26.dp)
)

/** أشكال خاصة بالتطبيق */
object NileShape {
    val Card = RoundedCornerShape(18.dp)
    val Chip = RoundedCornerShape(percent = 50)
    val Pill = RoundedCornerShape(percent = 50)
    val Track = RoundedCornerShape(13.dp)
    val Knob = RoundedCornerShape(10.dp)
    val AddButton = RoundedCornerShape(12.dp)
    val Sheet = RoundedCornerShape(topStart = 26.dp, topEnd = 26.dp)
    val Field = RoundedCornerShape(14.dp)
}

/** المقاسات الثابتة — عشان الشكل يفضل متزن في كل الشاشات */
object NileDim {
    val screenPad = 16.dp
    val cardPad = 15.dp
    val cardGap = 10.dp
    val sectionGap = 28.dp
    val hairline = 1.dp

    val topBarHeight = 60.dp
    val searchHeight = 46.dp
    val chipHeight = 36.dp
    val trackHeight = 44.dp
    val addButton = 36.dp
    val orderBarHeight = 62.dp

    val heroLogo = 148.dp
    val topLogo = 38.dp
}
