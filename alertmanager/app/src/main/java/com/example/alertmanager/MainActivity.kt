package com.example.alertmanager

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alarmManager = getSystemService(ALARM_SERVICE) as? AlarmManager
        val service = Intent(this, MyService::class.java)
        val p = PendingIntent.getService(this, 1,service,0

        )
        val time = System.currentTimeMillis()
        alarmManager?.setExact(AlarmManager.RTC_WAKEUP, time * 15 * 1000, p)
    }
}