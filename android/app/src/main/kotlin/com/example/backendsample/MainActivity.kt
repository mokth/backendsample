package com.example.backendsample

import android.os.Bundle

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodCall;
import android.content.Intent;
import android.content.IntentFilter;

class MainActivity: FlutterActivity() {

  var CHANNEL:String = "com.example";
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
   
    var methodChannel:MethodChannel? = MethodChannel(getFlutterView(), CHANNEL)
    var receiver:MyReceiver = MyReceiver(methodChannel)
    var mTime:IntentFilter = IntentFilter(Intent.ACTION_TIME_TICK)
    registerReceiver(receiver, mTime)
  }

}
