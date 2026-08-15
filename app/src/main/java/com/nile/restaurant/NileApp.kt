package com.nile.restaurant

import android.app.Application

class NileApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: NileApp
            private set
    }
}
