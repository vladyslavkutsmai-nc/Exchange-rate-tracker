package com.example.exchangeratetracker.presentation.home.model

interface HomeIntent {
    fun onUnpinCurrency(code: String)
    fun onPinCurrency(code: String)
}