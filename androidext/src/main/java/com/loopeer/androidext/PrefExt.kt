package com.loopeer.androidext

import android.content.Context
import android.preference.PreferenceManager

fun storeInt(context: Context, intValue: Int, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(context)
    sp.edit().putInt(tag, intValue).apply()
}

fun getInt(context: Context, tag: String, default: Int = 0): Int {
    return PreferenceManager.getDefaultSharedPreferences(context).getInt(tag, default)
}

fun storeBool(context: Context, boolValue: Boolean, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(context)
    sp.edit().putBoolean(tag, boolValue).apply()
}

fun getBool(context: Context, tag: String, default: Boolean = false): Boolean {
    return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(tag, default)
}

fun storeString(context: Context, string: String?, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(context)
    sp.edit().putString(tag, string).apply()
}

fun getString(context: Context, tag: String): String? {
    return PreferenceManager.getDefaultSharedPreferences(context).getString(tag, null)
}

fun storeLong(context: Context, longValue: Long, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(context)
    sp.edit().putLong(tag, longValue).apply()
}

fun getLong(context: Context, tag: String, default: Long = 0L): Long {
    return PreferenceManager.getDefaultSharedPreferences(context).getLong(tag, default)
}

fun storeFloat(context: Context, floatValue: Float, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(context)
    sp.edit().putFloat(tag, floatValue).apply()
}

fun getFloat(context: Context, tag: String, default: Float = 0f): Float {
    return PreferenceManager.getDefaultSharedPreferences(context).getFloat(tag, default)
}

fun storeStrSet(context: Context, strSet: Set<String?>?, tag: String) {
    val sp = PreferenceManager.getDefaultSharedPreferences(context)
    sp.edit().putStringSet(tag, strSet).apply()
}

fun getStrSet(context: Context, tag: String): Set<String?>? {
    return PreferenceManager.getDefaultSharedPreferences(context).getStringSet(tag, null)
}

