package com.litton.jetpack0813.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.work.*
import com.litton.jetpack0813.R
import timber.log.Timber

class MyWorkManagerActivity : AppCompatActivity(), View.OnClickListener {
    private val workManager = WorkManager.getInstance(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_workmanager)
        oneWork()
    }
    override fun onClick(v: View?) {
        when(v?.id){

        }
    }

    private fun oneWork() {
        /**
         * Constraints
         */
        val mConstraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()
        val oneTimeWorkRequestBuilder = OneTimeWorkRequestBuilder<MyWork>()
            .setInputData(workDataOf(oneTimeWork to oneTimeWorkData))
            .setConstraints(mConstraints)
            .build()
        val tewTimeWorkRequestBuilder = OneTimeWorkRequestBuilder<MyWork>()
            .setInputData(workDataOf(oneTimeWork to oneTimeWorkData))
            .setConstraints(mConstraints)
            .build()
        workManager.beginWith(oneTimeWorkRequestBuilder)
            .then(tewTimeWorkRequestBuilder)
            .enqueue()
        workManager.getWorkInfoByIdLiveData(oneTimeWorkRequestBuilder.id).observe(this, Observer {
            Timber.e("${it.state}")
            if (it.state == WorkInfo.State.SUCCEEDED) {
                Timber.e(it.outputData.getString(oneTimeWorkEnd))
            }

        })
    }

    companion object {
        const val oneTimeWork = "oneTimeWork"
        const val oneTimeWorkData = "oneTimeWorkData"
        const val oneTimeWorkEnd = "oneTimeWorkEnd"
        const val oneTimeWorkEndData = "oneTimeWorkEndData"
    }


}