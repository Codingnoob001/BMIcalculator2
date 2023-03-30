package com.example.bmicalculator

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "BMI_values")
data class BmiEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "Title") val title: String?,
    @ColumnInfo(name = "Bmi Value") val BmiValue: String?
   // @ColumnInfo(name = "byline") val byline: String?,
   // @ColumnInfo(name = "mediaImageUrl") val mediaImageUrl: String?
)
