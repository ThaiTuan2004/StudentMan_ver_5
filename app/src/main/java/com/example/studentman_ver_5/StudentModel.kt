package com.example.studentman_ver_5

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class StudentModel(
    val studentName: String,
    val studentId: String,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)