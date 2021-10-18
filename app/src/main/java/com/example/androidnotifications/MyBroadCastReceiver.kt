package com.example.androidnotifications

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyBroadCastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        //Action to be perfomed placed here
        context?.startActivity(intent)
    }

}