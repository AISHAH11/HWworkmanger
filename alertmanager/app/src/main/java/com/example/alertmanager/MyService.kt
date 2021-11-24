package com.example.alertmanager

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {

    override fun onCreate() {
        super.onCreate()
        var i=Intent(this,MainActivity2::class.java)
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(i)

    }

    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }



}