package com.litton.jetpack0813.livedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.litton.jetpack0813.R
import com.litton.jetpack0813.databinding.ActivityMyLivedataBinding

class MyLiveDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMyLivedataBinding>(
            this,
            R.layout.activity_my_livedata
        )

        val viewModel = ViewModelProviders.of(this).get(LiveDataViewModel::class.java)
        binding.data = viewModel
        binding.lifecycleOwner = this
    }
}