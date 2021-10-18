package com.trivka.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.trivka.usecase.TrivkUseCase

class TrivkViewModelFactory(private val trivkUseCase:TrivkUseCase) :
    ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TrivkViewModel::class.java)) {
            return TrivkViewModel(trivkUseCase = trivkUseCase) as T
        }
        throw IllegalAccessException("Unknown View Model Class")
    }
}