package com.nile.restaurant

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.nile.restaurant.ui.NileRoot
import com.nile.restaurant.ui.theme.NileBrush
import com.nile.restaurant.ui.theme.NileTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val splash = installSplashScreen()
        super.onCreate(savedInstanceState)

        // نسيب شاشة البداية شوية عشان أنيميشن اللوجو يكمّل
        var keepSplash = true
        splash.setKeepOnScreenCondition { keepSplash }
        window.decorView.postDelayed({ keepSplash = false }, 420)

        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(Color.Transparent.value.toInt()),
            navigationBarStyle = SystemBarStyle.dark(Color.Transparent.value.toInt())
        )
        WindowCompat.setDecorFitsSystemWindows(window, false)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            window.isNavigationBarContrastEnforced = false
        }

        setContent {
            NileTheme {
                NileRoot(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(NileBrush.Backdrop)
                )
            }
        }
    }
}
