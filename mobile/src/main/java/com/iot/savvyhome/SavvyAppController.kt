package com.iot.savvyhome

import android.app.Application
import com.iot.savvyhome.database.SavvyRealtimeDatabase

/**
 * Created by angad.tiwari on 29-Sep-17.
 */
class SavvyAppController: Application() {
    var savvyRealtimeDatabase: SavvyRealtimeDatabase? = null;

    override fun onCreate() {
        super.onCreate()
        savvyRealtimeDatabase = SavvyRealtimeDatabase();
    }
}