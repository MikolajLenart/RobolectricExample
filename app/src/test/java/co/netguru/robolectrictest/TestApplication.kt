package co.netguru.robolectrictest

import android.app.Application
import android.util.Log
import java.lang.RuntimeException

class TestApplication: Application() {

    override fun onCreate() {
        super.onCreate()
//        throw RuntimeException("Wrong!")
    }
}