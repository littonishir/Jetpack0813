package com.litton.jetpack0813.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.litton.jetpack0813.R
import com.litton.jetpack0813.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityScoreBinding>(this,R.layout.activity_score)
        val viewModel = ViewModelProviders.of(this).get(Score::class.java)
        binding.data = viewModel
        binding.lifecycleOwner = this
    }
}