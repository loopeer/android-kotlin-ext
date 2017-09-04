package com.loopeer.androidext

import android.content.Context
import android.support.annotation.*
import android.widget.Toast

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.longToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Context.toast(@StringRes messageRes: Int) {
    Toast.makeText(this, messageRes, Toast.LENGTH_SHORT).show()
}

fun Context.longToast(@StringRes messageRes: Int) {
    Toast.makeText(this, messageRes, Toast.LENGTH_LONG).show()
}

fun Context.resColor(@ColorRes colorRes: Int) = this.resources.getColor(colorRes)

fun Context.resString(@StringRes stringRes: Int) = this.resources.getString(stringRes)

fun Context.resString(@StringRes stringRes: Int, vararg formatArgs: Any?) = this.resources.getString(stringRes, formatArgs)

fun Context.resDrawable(@DrawableRes drawableRes: Int) = this.resources.getDrawable(drawableRes)

fun Context.resDimenPx(@DimenRes dimenRes: Int) = this.resources.getDimensionPixelSize(dimenRes)

fun Context.resInt(@IntegerRes intRes: Int) = this.resources.getInteger(intRes)

fun Context.resBoolean(@BoolRes boolRes: Int) = this.resources.getBoolean(boolRes)

fun Context.resIntArray(@ArrayRes intArrRes: Int) = this.resources.getIntArray(intArrRes)

fun Context.resStrArray(@ArrayRes strArrRes: Int) = this.resources.getStringArray(strArrRes)