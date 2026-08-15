package com.nile.restaurant.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

/**
 * الخط العريض (Serif) بيتحوّل على أندرويد لـ Noto Naskh —
 * نسخ عربي كلاسيكي، بيدي إحساس "مطعم له تاريخ".
 * الخط العادي (SansSerif) بيتحوّل لـ Noto Kufi/Roboto — نضيف وواضح للقراءة السريعة.
 */

private val Display = FontFamily.Serif
private val Body = FontFamily.SansSerif

private val ArabicLineHeight = LineHeightStyle(
    alignment = LineHeightStyle.Alignment.Center,
    trim = LineHeightStyle.Trim.None
)

val NileTypography = Typography(

    /* اسم المطعم في الهيرو */
    displayLarge = TextStyle(
        fontFamily = Display,
        fontWeight = FontWeight.Bold,
        fontSize = 46.sp,
        lineHeight = 58.sp,
        letterSpacing = 0.sp,
        lineHeightStyle = ArabicLineHeight
    ),

    /* اسم المطعم في الشريط العلوي */
    displayMedium = TextStyle(
        fontFamily = Display,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        lineHeightStyle = ArabicLineHeight
    ),

    /* عناوين الأقسام */
    headlineLarge = TextStyle(
        fontFamily = Display,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 34.sp,
        lineHeightStyle = ArabicLineHeight
    ),

    /* عنوان الشيت */
    headlineMedium = TextStyle(
        fontFamily = Display,
        fontWeight = FontWeight.Bold,
        fontSize = 23.sp,
        lineHeight = 30.sp,
        lineHeightStyle = ArabicLineHeight
    ),

    /* الشعار: اسم له تاريخ */
    titleLarge = TextStyle(
        fontFamily = Display,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        lineHeightStyle = ArabicLineHeight
    ),

    /* اسم الصنف */
    titleMedium = TextStyle(
        fontFamily = Body,
        fontWeight = FontWeight.Bold,
        fontSize = 17.sp,
        lineHeight = 24.sp,
        lineHeightStyle = ArabicLineHeight
    ),

    /* السعر */
    titleSmall = TextStyle(
        fontFamily = Body,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 19.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.2.sp
    ),

    /* نص عادي */
    bodyLarge = TextStyle(
        fontFamily = Body,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 24.sp,
        lineHeightStyle = ArabicLineHeight
    ),

    bodyMedium = TextStyle(
        fontFamily = Body,
        fontWeight = FontWeight.Medium,
        fontSize = 13.5.sp,
        lineHeight = 21.sp,
        lineHeightStyle = ArabicLineHeight
    ),

    /* الوصف الصغير تحت الاسم */
    bodySmall = TextStyle(
        fontFamily = Body,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        lineHeightStyle = ArabicLineHeight
    ),

    /* التبويبات */
    labelLarge = TextStyle(
        fontFamily = Body,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),

    /* الاسم الإنجليزي فوق القسم */
    labelMedium = TextStyle(
        fontFamily = Body,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 14.sp,
        letterSpacing = 3.sp
    ),

    labelSmall = TextStyle(
        fontFamily = Body,
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    )
)
