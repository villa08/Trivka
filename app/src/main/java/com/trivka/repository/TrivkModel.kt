package com.trivka.repository

data class TrivkModel(
    val id: String,
    val category: String,
    val question: String,
    var answerUser: String = "",
    val winds: Int = 0,
    val answer: List<AnswerModel>
)

data class AnswerModel(
    val option:String,
    val truth:Boolean
)