package com.calak.libstick

import android.view.View
import com.google.android.material.snackbar.Snackbar

/**
@author Jemmy
Created on 30/01/2023 at 15:58.
 */

fun View.showAlert(message: String) {
    Snackbar.make(this, message, Snackbar.LENGTH_SHORT).show()
}
