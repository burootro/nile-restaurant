package com.nile.restaurant.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

/* ────────────── الألوان الخام ────────────── */

val Ink            = Color(0xFF070A0F)
val InkSoft        = Color(0xFF0C1119)
val Surface1       = Color(0xFF121A24)
val Surface2       = Color(0xFF161F2B)
val Surface3       = Color(0xFF1B2431)
val TrackDark      = Color(0xFF0A0E14)

val BrassLight     = Color(0xFFF8EBBB)
val Brass          = Color(0xFFE8C466)
val BrassMid       = Color(0xFFD9AB44)
val BrassDeep      = Color(0xFFC9962B)
val BrassDark      = Color(0xFFA9761B)
val BrassShadow    = Color(0xFF8A5F14)

val Cream          = Color(0xFFF0E7D4)
val CreamDim       = Color(0xFFC3BCA9)
val Muted          = Color(0xFF8D97A6)
val MutedDeep      = Color(0xFF5C6675)

val Ember          = Color(0xFFE2603A)
val OnBrass        = Color(0xFF241705)

val HairLine       = Color(0x29E8C466)   // 16%
val HairSoft       = Color(0x0FFFFFFF)   // 6%

/* ────────────── الفُرَش (Brushes) ────────────── */

object NileBrush {

    /** النحاس المصقول — للأزرار والأسعار والعناوين */
    val Polished = Brush.linearGradient(
        0.00f to BrassLight,
        0.26f to Brass,
        0.55f to BrassDeep,
        0.78f to Color(0xFFF2D06B),
        1.00f to BrassDark,
        start = Offset.Zero,
        end = Offset(220f, 220f)
    )

    /** نحاس أفقي ناعم — للخطوط الفاصلة */
    val Hairline = Brush.horizontalGradient(
        0.00f to Color.Transparent,
        0.45f to BrassDeep,
        1.00f to Color.Transparent
    )

    /** لمعة أعلى الكارت */
    val CardSheen = Brush.horizontalGradient(
        0.00f to Color.Transparent,
        0.50f to Color(0x47F8EBBB),
        1.00f to Color.Transparent
    )

    /** جسم الكارت */
    val CardBody = Brush.verticalGradient(
        0f to Surface2,
        1f to Surface1
    )

    /** خلفية التطبيق — وهج جمر خفيف */
    val Backdrop = Brush.verticalGradient(
        0.00f to Color(0xFF0B1119),
        0.35f to Ink,
        1.00f to Color(0xFF05080C)
    )

    /** توهّج ناري خلف اللوجو */
    val EmberGlow = Brush.radialGradient(
        0.0f to Color(0x33E2603A),
        1.0f to Color.Transparent
    )

    /** توهّج ذهبي علوي */
    val GoldGlow = Brush.radialGradient(
        0.0f to Color(0x24E8C466),
        1.0f to Color.Transparent
    )

    /** تدرّج شفاف تحت شريط الطلب */
    val BottomScrim = Brush.verticalGradient(
        0.0f to Color.Transparent,
        0.45f to Color(0xE6070A0F),
        1.0f to Ink
    )
}

/* ────────────── مجموعة ألوان التطبيق ────────────── */

@Immutable
data class NileColors(
    val ink: Color = Ink,
    val inkSoft: Color = InkSoft,
    val surface: Color = Surface1,
    val surfaceHigh: Color = Surface2,
    val surfaceRaised: Color = Surface3,
    val track: Color = TrackDark,
    val brass: Color = Brass,
    val brassLight: Color = BrassLight,
    val brassDeep: Color = BrassDeep,
    val brassDark: Color = BrassDark,
    val onBrass: Color = OnBrass,
    val cream: Color = Cream,
    val creamDim: Color = CreamDim,
    val muted: Color = Muted,
    val mutedDeep: Color = MutedDeep,
    val ember: Color = Ember,
    val hairline: Color = HairLine,
    val hairSoft: Color = HairSoft
)

val LocalNileColors = staticCompositionLocalOf { NileColors() }
