package com.example.backendsample

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.MethodChannel;

class MyReceiver: BroadcastReceiver {
    var methodChannel:MethodChannel? = null

    constructor():super(){
    }

    constructor(methodchannel:MethodChannel?):super(){
        this.methodChannel = methodchannel
    }
    override fun  onReceive(context:Context,intent:Intent){
        this.methodChannel?.invokeMethod("simpletask","");
    }
}