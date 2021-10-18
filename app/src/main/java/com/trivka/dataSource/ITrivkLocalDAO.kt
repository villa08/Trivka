package com.trivka.dataSource

import androidx.room.*

@Dao
interface ITrivkLocalDAO {

    @Transaction
    suspend fun executeTransaction(entity: List<TrivkEntity>){
        deleteAll()
        insert(entity)
    }

    @Query("SELECT * FROM trivk")
    fun select(): List<TrivkEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: List<TrivkEntity>)

    @Query("UPDATE trivk SET answerUser =:answerUser  WHERE id = :id")
    fun update(id:String, answerUser:String)

    @Query("DELETE FROM trivk")
    fun deleteAll()
}