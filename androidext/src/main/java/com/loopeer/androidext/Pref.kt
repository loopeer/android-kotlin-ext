@file:Suppress("NOTHING_TO_INLINE", "unused")
package com.loopeer.androidext

import android.app.Dialog
import android.content.Context
import android.preference.PreferenceManager
import android.support.v4.app.Fragment

fun Context.storeInt(intValue: Int, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(this)
    sp.edit().putInt(tag, intValue).apply()
}

fun Context.getInt(tag: String, default: Int = 0): Int {
    return PreferenceManager.getDefaultSharedPreferences(this).getInt(tag, default)
}

fun Context.storeBool(boolValue: Boolean, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(this)
    sp.edit().putBoolean(tag, boolValue).apply()
}

fun Context.getBool(tag: String, default: Boolean = false): Boolean {
    return PreferenceManager.getDefaultSharedPreferences(this).getBoolean(tag, default)
}

fun Context.storeString(string: String?, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(this)
    sp.edit().putString(tag, string).apply()
}

fun Context.getString(tag: String, default: String? = null): String? {
    return PreferenceManager.getDefaultSharedPreferences(this).getString(tag, default)
}

fun Context.storeLong(longValue: Long, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(this)
    sp.edit().putLong(tag, longValue).apply()
}

fun Context.getLong(tag: String, default: Long = 0L): Long {
    return PreferenceManager.getDefaultSharedPreferences(this).getLong(tag, default)
}

fun Context.storeFloat(floatValue: Float, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(this)
    sp.edit().putFloat(tag, floatValue).apply()
}

fun Context.getFloat(tag: String, default: Float = 0F): Float {
    return PreferenceManager.getDefaultSharedPreferences(this).getFloat(tag, default)
}

fun Context.storeStringSet(strSet: Set<String?>?, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(this)
    sp.edit().putStringSet(tag, strSet).apply()
}

fun Context.getStringSet(tag: String): Set<String?>? {
    return PreferenceManager.getDefaultSharedPreferences(this).getStringSet(tag, null)
}

//fragment
inline fun Fragment.storeInt(intValue: Int, tag: String) = this.context.storeInt(intValue, tag)

inline fun Fragment.getInt(tag: String, default: Int = 0): Int = this.context.getInt(tag, default)

inline fun Fragment.storeBool(boolValue: Boolean, tag: String) = this.context.storeBool(boolValue, tag)

inline fun Fragment.getBool(tag: String, default: Boolean = false) = this.context.getBool(tag, default)

inline fun Fragment.storeString(string: String?, tag: String) = this.context.storeString(string, tag)

inline fun Fragment.getString(tag: String, default: String? = null) = this.context.getString(tag, default)

inline fun Fragment.storeLong(longValue: Long, tag: String) = this.context.storeLong(longValue, tag)

inline fun Fragment.getLong(tag: String, default: Long = 0L) = this.context.getLong(tag, default)

inline fun Fragment.storeFloat(floatValue: Float, tag: String) = this.context.storeFloat(floatValue, tag)

inline fun Fragment.getFloat(tag: String, default: Float = 0F) = this.context.getFloat(tag, default)

inline fun Fragment.storeStringSet(strSet: Set<String?>?, tag: String) = this.context.storeStringSet(strSet, tag)

inline fun Fragment.getStringSet(tag: String): Set<String?>? = this.context.getStringSet(tag)

//dialog
inline fun Dialog.storeInt(intValue: Int, tag: String) = this.context.storeInt(intValue, tag)

inline fun Dialog.getInt(tag: String, default: Int = 0): Int = this.context.getInt(tag, default)

inline fun Dialog.storeBool(boolValue: Boolean, tag: String) = this.context.storeBool(boolValue, tag)

inline fun Dialog.getBool(tag: String, default: Boolean = false) = this.context.getBool(tag, default)

inline fun Dialog.storeString(string: String?, tag: String) = this.context.storeString(string, tag)

inline fun Dialog.getString(tag: String, default: String? = null) = this.context.getString(tag, default)

inline fun Dialog.storeLong(longValue: Long, tag: String) = this.context.storeLong(longValue, tag)

inline fun Dialog.getLong(tag: String, default: Long = 0L) = this.context.getLong(tag, default)

inline fun Dialog.storeFloat(floatValue: Float, tag: String) = this.context.storeFloat(floatValue, tag)

inline fun Dialog.getFloat(tag: String, default: Float = 0F) = this.context.getFloat(tag, default)

inline fun Dialog.storeStringSet(strSet: Set<String?>?, tag: String) = this.context.storeStringSet(strSet, tag)

inline fun Dialog.getStringSet(tag: String): Set<String?>? = this.context.getStringSet(tag)