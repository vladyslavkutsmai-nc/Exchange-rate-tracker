package com.example.exchangeratetracker.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.exchangeratetracker.data.local.dao.CurrencyDao
import com.example.exchangeratetracker.data.local.dao.CurrencyInfoDao
import com.example.exchangeratetracker.data.local.dao.CurrencyRateDao
import com.example.exchangeratetracker.data.local.entities.CurrencyEntity
import com.example.exchangeratetracker.data.local.entities.CurrencyInfoEntity
import com.example.exchangeratetracker.data.local.entities.CurrencyRateEntity

@Database(
    entities = [CurrencyEntity::class, CurrencyInfoEntity::class, CurrencyRateEntity::class],
    version = 1,
    exportSchema = false
)
abstract class CurrencyDatabase : RoomDatabase() {
    abstract fun currencyDao(): CurrencyDao
    abstract fun currencyInfoDao(): CurrencyInfoDao
    abstract fun currencyRateDao(): CurrencyRateDao
}