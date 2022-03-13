package com.kivous.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.kivous.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.tvCount.text = viewModel.num.toString()

        binding.btnIncrement.setOnClickListener {
            viewModel.inc()
            binding.tvCount.text = viewModel.num.toString()
        }
        binding.btnDecrement.setOnClickListener {
            viewModel.dec()
            binding.tvCount.text = viewModel.num.toString()
        }
        binding.btnReset.setOnClickListener {
            viewModel.reset()
            binding.tvCount.text = viewModel.num.toString()
        }
    }

}