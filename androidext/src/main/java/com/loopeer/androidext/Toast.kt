@file:Suppress("NOTHING_TO_INLINE", "unused")
package com.loopeer.androidext

import android.content.Context
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.widget.Toast

inline fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

inline fun Context.longToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

inline fun Context.toast(@StringRes messageRes: Int) {
    Toast.makeText(this, messageRes, Toast.LENGTH_SHORT).show()
}

inline fun Context.longToast(@StringRes messageRes: Int) {
    Toast.makeText(this, messageRes, Toast.LENGTH_LONG).show()
}

//fragment
inline fun Fragment.toast(message: String) {
    Toast.makeText(this.context, message, Toast.LENGTH_SHORT).show()
}

inline fun Fragment.longToast(message: String) {
    Toast.makeText(this.context, message, Toast.LENGTH_LONG).show()
}

inline fun Fragment.toast(@StringRes messageRes: Int) {
    Toast.makeText(this.context, messageRes, Toast.LENGTH_SHORT).show()
}

inline fun Fragment.longToast(@StringRes messageRes: Int) {
    Toast.makeText(this.context, messageRes, Toast.LENGTH_LONG).show()
}