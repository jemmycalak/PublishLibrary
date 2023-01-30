package com.calak.contohlib

import android.view.View
import com.google.android.material.snackbar.Snackbar

/**
@author Jemmy
Created on 30/01/2023 at 16:34.
 */

fun View.showText(text: String) {
    Snackbar.make(this, text, Snackbar.LENGTH_SHORT).show()
}
