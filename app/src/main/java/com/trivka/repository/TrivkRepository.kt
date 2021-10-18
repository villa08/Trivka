package com.trivka.repository

import com.trivka.dataSource.TrivkDataSourceLocal
import com.trivka.frameWork.ResponseResult
import com.trivka.ui.viewModel.LoadDataTrivk.toTrivkEntity
import com.trivka.ui.viewModel.LoadDataTrivk.toTrivkModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class TrivkRepository(private val trivkDataSourceLocal: TrivkDataSourceLocal) : ITrivkRepository {

    override suspend fun insert(values: List<TrivkModel>) = flow {
        emit(ResponseResult.loading())
        emit(ResponseResult.success(trivkDataSourceLocal.insert(values.map { it.toTrivkEntity() })))
    }.flowOn(Dispatchers.IO)


    override suspend fun select() = flow {
        emit(ResponseResult.loading())

        val result = trivkDataSourceLocal.select().map { it.toTrivkModel() }

        emit(ResponseResult.success(result))

    }.flowOn(Dispatchers.IO)

    override suspend fun update(id: String, answerUser: String) = flow {
        emit(ResponseResult.loading())

        val result = trivkDataSourceLocal.update(id = id, answerUser = answerUser)

        emit(ResponseResult.success(result))

    }.flowOn(Dispatchers.IO)
}