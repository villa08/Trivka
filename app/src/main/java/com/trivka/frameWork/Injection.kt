package com.trivka.frameWork

import android.content.Context
import com.trivka.dataSource.TrivkDataSourceLocal
import com.trivka.frameWork.DataBase
import com.trivka.repository.TrivkRepository
import com.trivka.ui.viewModel.TrivkViewModelFactory
import com.trivka.usecase.TrivkUseCase

class Injection(context: Context) {

    private val iWalkthroughLocalDAO = DataBase.getInstance(context = context).iTrivkLocalDAO()

    private val trivkDataSourceLocal = TrivkDataSourceLocal(iWalkthroughLocalDAO)

    private val trivkRepository = TrivkRepository(trivkDataSourceLocal)

    private val trivkUseCase = TrivkUseCase(trivkRepository)

    val trivkViewModelFactory = TrivkViewModelFactory(trivkUseCase)
}