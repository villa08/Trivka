package com.trivka.dataSource

class TrivkDataSourceLocal(private val iTrivkLocalDAO: ITrivkLocalDAO) {

    suspend fun insert(values: List<TrivkEntity>) {
        iTrivkLocalDAO.executeTransaction(values)
    }

    fun select(): List<TrivkEntity> = iTrivkLocalDAO.select()

    fun update(id: String, answerUser: String) =
        iTrivkLocalDAO.update(id = id, answerUser = answerUser)
}