package com.trivka.usecase

import androidx.lifecycle.Transformations.map
import com.trivka.repository.TrivkModel
import com.trivka.repository.TrivkRepository
import com.trivka.ui.viewModel.LoadDataTrivk.toTrivkEntity

class TrivkUseCase(private val trivkRepository: TrivkRepository) : ITrivkUsecase {
    override suspend fun insert(values: List<TrivkModel>) = trivkRepository.insert(values)

    override suspend fun select() = trivkRepository.select()

    override suspend fun update(id: String, answerUser: String) =
        trivkRepository.update(id = id, answerUser = answerUser)
}