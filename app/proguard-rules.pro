-keepattributes *Annotation*, InnerClasses, Signature
-dontwarn kotlinx.**
-dontwarn org.jetbrains.annotations.**

-keep class com.nile.restaurant.data.** { *; }

-keepclassmembers class * {
    @androidx.compose.runtime.Composable <methods>;
}
