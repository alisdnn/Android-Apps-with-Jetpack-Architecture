package com.example.openapi.ui

import android.app.Activity
import android.util.Log
import android.widget.Toast
import androidx.annotation.StringRes
import com.afollestad.materialdialogs.MaterialDialog
import com.example.openapi.R
import com.example.openapi.util.StateMessageCallback

private val TAG: String = "AppDebug"

fun Activity.displayToast(
    @StringRes message:Int,
    stateMessageCallback: StateMessageCallback
){
    Toast.makeText(this, message,Toast.LENGTH_LONG).show()
    stateMessageCallback.removeMessageFromStack()
}

fun Activity.displayToast(
    message:String,
    stateMessageCallback: StateMessageCallback
){
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    stateMessageCallback.removeMessageFromStack()
}


interface AreYouSureCallback {

    fun proceed()

    fun cancel()
}




