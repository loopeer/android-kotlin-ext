@file:Suppress("NOTHING_TO_INLINE", "unused")
package com.loopeer.androidext

import android.content.Context
import android.support.annotation.*
import android.support.v4.app.Fragment
import android.view.View

fun Context.resColor(@ColorRes colorRes: Int) = this.resources.getColor(colorRes)

fun Context.resString(@StringRes stringRes: Int) = this.resources.getString(stringRes)

fun Context.resString(@StringRes stringRes: Int, vararg formatArgs: Any?) = this.resources.getString(stringRes, formatArgs)

fun Context.resDrawable(@DrawableRes drawableRes: Int) = this.resources.getDrawable(drawableRes)

fun Context.resDimenPx(@DimenRes dimenRes: Int) = this.resources.getDimensionPixelSize(dimenRes)

fun Context.resInt(@IntegerRes intRes: Int) = this.resources.getInteger(intRes)

fun Context.resBoolean(@BoolRes boolRes: Int) = this.resources.getBoolean(boolRes)

fun Context.resIntArray(@ArrayRes intArrRes: Int) = this.resources.getIntArray(intArrRes)

fun Context.resStrArray(@ArrayRes strArrRes: Int) = this.resources.getStringArray(strArrRes)


//fragment
inline fun Fragment.resColor(@ColorRes colorRes: Int) = this.resources.getColor(colorRes)

inline fun Fragment.resString(@StringRes stringRes: Int) = this.resources.getString(stringRes)

inline fun Fragment.resString(@StringRes stringRes: Int, vararg formatArgs: Any?) = this.resources.getString(stringRes, formatArgs)

inline fun Fragment.resDrawable(@DrawableRes drawableRes: Int) = this.resources.getDrawable(drawableRes)

inline fun Fragment.resDimenPx(@DimenRes dimenRes: Int) = this.resources.getDimensionPixelSize(dimenRes)

inline fun Fragment.resInt(@IntegerRes intRes: Int) = this.resources.getInteger(intRes)

inline fun Fragment.resBoolean(@BoolRes boolRes: Int) = this.resources.getBoolean(boolRes)

inline fun Fragment.resIntArray(@ArrayRes intArrRes: Int) = this.resources.getIntArray(intArrRes)

inline fun Fragment.resStrArray(@ArrayRes strArrRes: Int) = this.resources.getStringArray(strArrRes)

//view
inline fun View.resColor(@ColorRes colorRes: Int) = this.resources.getColor(colorRes)

inline fun View.resString(@StringRes stringRes: Int) = this.resources.getString(stringRes)

inline fun View.resString(@StringRes stringRes: Int, vararg formatArgs: Any?) = this.resources.getString(stringRes, formatArgs)

inline fun View.resDrawable(@DrawableRes drawableRes: Int) = this.resources.getDrawable(drawableRes)

inline fun View.resDimenPx(@DimenRes dimenRes: Int) = this.resources.getDimensionPixelSize(dimenRes)

inline fun View.resInt(@IntegerRes intRes: Int) = this.resources.getInteger(intRes)

inline fun View.resBoolean(@BoolRes boolRes: Int) = this.resources.getBoolean(boolRes)

inline fun View.resIntArray(@ArrayRes intArrRes: Int) = this.resources.getIntArray(intArrRes)

inline fun View.resStrArray(@ArrayRes strArrRes: Int) = this.resources.getStringArray(strArrRes)