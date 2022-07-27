package com.example.androidbroadcastreceiverdemo

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var dynamicBroadcastReceiver: ExampleDynamicBroadcastReceiver
    private lateinit var intentFilter: IntentFilter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create dynamic receiver (not register)
        dynamicBroadcastReceiver = ExampleDynamicBroadcastReceiver()

        // create intent filter for receiver
        intentFilter = IntentFilter()

        // configure intent filter for action we need to catch
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)

    }

    override fun onStart() {
        super.onStart()
        registerReceiver(dynamicBroadcastReceiver, intentFilter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(dynamicBroadcastReceiver)
    }

}