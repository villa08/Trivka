package com.trivka.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
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
    private var countQuestion:Int = 0

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

            countTrivkCoin(value = it.winds)
        }
    }

    private fun countTrivkCoin(value: Int) {
        binding.floatingButtonCount.visibility = View.VISIBLE
        if (value != 0){
            binding.floatingButtonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.green_4CAF50))
        } else {
            binding.floatingButtonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.red_F44336))
        }

        countQuestion += value
        binding.floatingButtonCount.text = "$countQuestion TrivkCoin"
    }

    private fun showData(listBooks: List<TrivkModel>) {
        gameAdapter.onSetData(listBooks as MutableList<TrivkModel>)
    }
}