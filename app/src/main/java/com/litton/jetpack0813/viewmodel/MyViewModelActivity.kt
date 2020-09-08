package com.litton.jetpack0813.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.litton.jetpack0813.R
import kotlinx.android.synthetic.main.activity_my_view_model.*

class MyViewModelActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var myViewModel:MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_view_model)
        mButton.setOnClickListener(this)
        mButton2.setOnClickListener(this)
        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        myViewModel.count1.observe(this, Observer {
            mTextView.text = myViewModel.count1.value.toString()
        })
        myViewModel.count2.observe(this, Observer {
            mTextView2.text = myViewModel.count2.value.toString()
        })
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.mButton->{
                myViewModel.add1(1)
            }
            R.id.mButton2->{
                myViewModel.add2(1)
            }
        }
    }
}