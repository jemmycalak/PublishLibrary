package com.calak.libdadie

import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

/**
@author Jemmy
Created on 29/01/2023 at 16:49.
 */

fun View.showRandomInt() {
    val value = Random.nextInt(0, 100)
    Snackbar.make(this, "Your got $value", Snackbar.LENGTH_LONG).show()
}
