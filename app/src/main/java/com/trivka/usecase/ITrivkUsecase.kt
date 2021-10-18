package com.trivka.usecase

import com.trivka.frameWork.ResponseResult
import com.trivka.repository.TrivkModel
import kotlinx.coroutines.flow.Flow

interface ITrivkUsecase {
    suspend fun insert(values: List<TrivkModel>): Flow<ResponseResult<Unit>?>
    suspend fun select(): Flow<ResponseResult<List<TrivkModel>>?>
    suspend fun update(id: String, answerUser: String): Flow<ResponseResult<Unit>?>
}