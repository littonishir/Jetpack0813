package com.litton.jetpack0813.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.litton.jetpack0813.R
import kotlinx.android.synthetic.main.activity_my_livedata.*

class MyLiveDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_livedata)
        val viewModel = ViewModelProviders.of(this).get(LiveDataViewModel::class.java)
        viewModel.likeNum.observe(this, Observer {
            textView.text = it.toString()

        })

        imageButton1.setOnClickListener {
            viewModel.add(1)
        }
        imageButton2.setOnClickListener {
            viewModel.add(-1)
        }
    }
}