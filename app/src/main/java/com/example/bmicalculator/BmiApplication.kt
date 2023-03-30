package com.example.bmicalculator

import android.app.Application

class BmiApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}