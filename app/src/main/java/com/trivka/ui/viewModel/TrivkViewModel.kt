package com.trivka.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.trivka.frameWork.ResponseResult
import com.trivka.repository.TrivkModel
import com.trivka.ui.viewModel.LoadDataTrivk.toTrivkEntity
import com.trivka.usecase.TrivkUseCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class TrivkViewModel(private val trivkUseCase: TrivkUseCase) : ViewModel() {

    private val _trivks = MutableLiveData<ResponseResult<List<TrivkModel>>>()

    // Se accede desde la UI
    val trivks: LiveData<ResponseResult<List<TrivkModel>>> get() = _trivks

    fun insert() = viewModelScope.launch {
        trivkUseCase.insert(createDate())
    }

    fun select() = viewModelScope.launch {
        trivkUseCase.select().collect { questions ->
            _trivks.value = questions
        }
    }

    fun update(id: String, answerUser: String) = viewModelScope.launch {
        trivkUseCase.update(id = id, answerUser = answerUser)
    }

    fun createDate(): List<TrivkModel> = LoadDataTrivk.listData()
}