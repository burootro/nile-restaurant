package com.nile.restaurant.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection

private val NileColorScheme = darkColorScheme(
    primary = Brass,
    onPrimary = OnBrass,
    primaryContainer = BrassDeep,
    onPrimaryContainer = OnBrass,

    secondary = Ember,
    onSecondary = Cream,

    background = Ink,
    onBackground = Cream,

    surface = Surface1,
    onSurface = Cream,
    surfaceVariant = Surface2,
    onSurfaceVariant = Muted,

    outline = HairLine,
    outlineVariant = HairSoft,

    error = Ember,
    onError = Cream
)

@Composable
fun NileTheme(content: @Composable () -> Unit) {

    val colors = remember { NileColors() }

    CompositionLocalProvider(
        LocalNileColors provides colors,
        // التطبيق عربي بالكامل — نثبّت الاتجاه من اليمين لليسار
        LocalLayoutDirection provides LayoutDirection.Rtl
    ) {
        MaterialTheme(
            colorScheme = NileColorScheme,
            typography = NileTypography,
            shapes = NileShapes,
            content = content
        )
    }
}

/** اختصار للوصول للألوان: NileTheme.colors.brass */
object NileThemeTokens {
    val colors: NileColors
        @Composable get() = LocalNileColors.current
}
