package com.linuxh2o.aura.utilities

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.linuxh2o.aura.BuildConfig
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null && context != null){
            when(intent.action){
                Intent.ACTION_BOOT_COMPLETED, Intent.ACTION_LOCKED_BOOT_COMPLETED, Intent.ACTION_REBOOT -> {
                    if (BuildConfig.DEBUG){
                        Log.d(TAG, "onReceive: Device booted")
                    }
                }
                else -> {
                    Log.d(TAG, "onReceive: Else intent action")
                }
            }
        } else {
            Log.d(TAG, "onReceive: Null intent or context")
        }
    }

    companion object {
        private const val TAG = "BootReceiver"
    }
}