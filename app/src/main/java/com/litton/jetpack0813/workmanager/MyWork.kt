package com.litton.jetpack0813.workmanager

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import timber.log.Timber

class MyWork(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {
    /**
     * 重写 doWork 方法
     * 可以获取传入的值，也可以工作结束后返回一些数据。
     */
    override fun doWork(): Result {
        val string = inputData.getString(MyWorkManagerActivity.oneTimeWork)
        Timber.e("MyWork,Start.$string")
        Thread.sleep(3000)
        Timber.e("MyWork,End.$string")
        return Result.success(workDataOf(MyWorkManagerActivity.oneTimeWorkEnd to MyWorkManagerActivity.oneTimeWorkEndData))
    }
}