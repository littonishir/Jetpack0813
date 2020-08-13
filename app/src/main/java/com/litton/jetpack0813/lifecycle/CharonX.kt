package com.litton.jetpack0813.lifecycle

import android.content.Context
import android.os.SystemClock
import android.util.AttributeSet
import android.widget.Chronometer
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent


/**
 * 计时器控件（带有生命周期感应）
 * 记录界面显示时长，只有控件在前台显示时记录时长。
 * Created by littonishir on 2020/6/22.
 */
class CharonX(context: Context?, attrs: AttributeSet?) : Chronometer(context, attrs),
    LifecycleObserver {
    private var elapsedTime = 0L

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private fun resume() {
        base = SystemClock.elapsedRealtime() - elapsedTime
        start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private fun pause() {
        elapsedTime = SystemClock.elapsedRealtime() - base
        stop()
    }
}