package com.trivka.dataSource

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.trivka.repository.AnswerModel

@Entity(tableName = "trivk")
data class TrivkEntity(
    @PrimaryKey(autoGenerate = true)
    val _id: Int = 0,
    @ColumnInfo(name = "id")
    val id: String,
    @ColumnInfo(name = "category")
    val category: String,
    @ColumnInfo(name = "question")
    val question: String,
    @ColumnInfo(name = "answerUser")
    val answerUser: String,
    @ColumnInfo(name = "winds")
    val winds: Int
    //val answer: List<AnswerModel>
)