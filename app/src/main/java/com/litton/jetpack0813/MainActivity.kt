package com.litton.jetpack0813

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.litton.jetpack0813.lifecycle.MyLifecycleActivity
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

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton.setOnClickListener(this)
        mButton1.setOnClickListener(this)
    }


}