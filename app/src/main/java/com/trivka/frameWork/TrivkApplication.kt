package com.trivka.frameWork

import android.app.Application

class TrivkApplication:Application() {
    companion object {
        lateinit var injection: Injection
    }

    override fun onCreate() {
        super.onCreate()
        injection = Injection(applicationContext)
    }
}