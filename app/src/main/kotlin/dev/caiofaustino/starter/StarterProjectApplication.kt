package dev.caiofaustino.starter

import android.app.Application
import logcat.AndroidLogcatLogger

class StarterProjectApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AndroidLogcatLogger.installOnDebuggableApp(this)
    }
}