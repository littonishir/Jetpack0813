package com.litton.jetpack0813.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.litton.jetpack0813.R
import kotlinx.android.synthetic.main.activity_lifecycle_my.*

class MyLifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_my)
        /**
         * 计时器例子
         */
        lifecycle.addObserver(mCharonX)
        /**
         * Lifecycle用法演示
         */
        lifecycle.addObserver(MyLifecycle(lifecycle))
    }
}