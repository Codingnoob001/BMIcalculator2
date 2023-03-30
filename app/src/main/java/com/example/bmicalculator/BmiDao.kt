package com.example.bmicalculator

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BmiDao{
    @Query("SELECT * FROM BMI_values")
    fun getAll(): kotlinx.coroutines.flow.Flow<List<BmiEntity>>

    @Insert
    fun insertAll(articles: List<BmiEntity>)

    @Query("DELETE FROM BMI_values")
    fun deleteAll()

}