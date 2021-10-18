package com.trivka.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.trivka.R
import com.trivka.databinding.ActivityWelcomeBinding
import com.trivka.frameWork.ResponseResult
import com.trivka.frameWork.TrivkApplication
import com.trivka.ui.viewModel.TrivkViewModel

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding
    private lateinit var trivkViewModel: TrivkViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val trivkViewModelFactory = TrivkApplication.injection.trivkViewModelFactory
        trivkViewModel = ViewModelProvider(this, trivkViewModelFactory).get()

        trivkViewModel.insert()

        binding.buttonStartGame.setOnClickListener {

            launchGameActivity()

            /*trivkViewModel.select()
            getData()*/
        }
    }

    private fun launchGameActivity() {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }

    private fun getData() {
        trivkViewModel.trivks.observe(this, { result ->
            when (result.status) {
                ResponseResult.Status.SUCCESS -> {
                    for (value in result.data!!) {
                        Log.e("data view: ", value.question)
                    }
                }

                ResponseResult.Status.ERROR -> {
                    result.message?.let {
                        Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
                    }
                }

                ResponseResult.Status.LOADING -> {

                }
            }
        })
    }
}