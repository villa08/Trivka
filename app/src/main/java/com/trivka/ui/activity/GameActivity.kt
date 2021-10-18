package com.trivka.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.trivka.R
import com.trivka.databinding.ActivityGameBinding
import com.trivka.databinding.ActivityWelcomeBinding
import com.trivka.frameWork.TrivkApplication
import com.trivka.repository.TrivkModel
import com.trivka.ui.GameAdapter
import com.trivka.ui.viewModel.TrivkViewModel

class GameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameBinding
    private val gameAdapter by lazy { GameAdapter() }
    private lateinit var trivkViewModel: TrivkViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val trivkViewModelFactory = TrivkApplication.injection.trivkViewModelFactory
        trivkViewModel = ViewModelProvider(this, trivkViewModelFactory).get()

        binding.apply {
            this.recyclerViewGame.apply {
                this.layoutManager = LinearLayoutManager(this@GameActivity)
                this.adapter = gameAdapter
            }
        }

        showData(trivkViewModel.createDate())

        gameAdapter.onClickItem = {
            Toast.makeText(this, it.answerUser, Toast.LENGTH_SHORT).show()

            //countTrivkCoin(value = )
        }
    }

    private fun countTrivkCoin(value: Int) {
        binding.floatingButtonCount.text = value.toString()
    }

    private fun showData(listBooks: List<TrivkModel>) {
        gameAdapter.onSetData(listBooks as MutableList<TrivkModel>)
    }
}