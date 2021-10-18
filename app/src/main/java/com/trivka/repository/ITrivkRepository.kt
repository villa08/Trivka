package com.trivka.repository

import com.trivka.frameWork.ResponseResult
import kotlinx.coroutines.flow.Flow

interface ITrivkRepository {
    suspend fun insert(values: List<TrivkModel>): Flow<ResponseResult<Unit>?>
    suspend fun select(): Flow<ResponseResult<List<TrivkModel>>?>
    suspend fun update(id: String, answerUser: String): Flow<ResponseResult<Unit>?>
}