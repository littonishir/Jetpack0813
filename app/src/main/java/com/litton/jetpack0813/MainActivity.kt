package com.litton.jetpack0813

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.litton.jetpack0813.demo.ScoreActivity
import com.litton.jetpack0813.lifecycle.MyLifecycleActivity
import com.litton.jetpack0813.livedata.MyLiveDataActivity
import com.litton.jetpack0813.viewmodel.MyViewModelActivity
import com.litton.jetpack0813.workmanager.MyWorkManagerActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.mButton->{
                startActivity(Intent(this,MyLifecycleActivity::class.java))
            }
            R.id.mButton1->{
                startActivity(Intent(this,MyWorkManagerActivity::class.java))
            }
            R.id.mButton2->{
                startActivity(Intent(this,MyViewModelActivity::class.java))
            }
            R.id.mButton3->{
                startActivity(Intent(this, MyLiveDataActivity::class.java))
            }
            R.id.mButton4->{
                startActivity(Intent(this, ScoreActivity::class.java))
            }

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton.setOnClickListener(this)
        mButton1.setOnClickListener(this)
        mButton2.setOnClickListener(this)
        mButton3.setOnClickListener(this)
        mButton4.setOnClickListener(this)
    }


}