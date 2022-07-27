package com.example.androidbroadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ExampleDynamicBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        if (intent == null ) {
            Toast.makeText(context, "Null intent", Toast.LENGTH_SHORT).show()
            return
        }

        if (intent.action == null ) {
            Toast.makeText(context, "Null intent action", Toast.LENGTH_SHORT).show()
            return
        }

        Toast.makeText(context, intent.action, Toast.LENGTH_SHORT).show()

    }

}