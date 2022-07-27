package com.example.androidbroadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

// Static broadcast receiver
// --- should be declared in android manifest file

class ExampleStaticBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        if (intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED) {
            //Toast.makeText(context, "Airplane mode changed", Toast.LENGTH_SHORT).show()
        }

    }

}