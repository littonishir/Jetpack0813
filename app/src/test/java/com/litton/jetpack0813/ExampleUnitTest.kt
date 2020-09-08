package com.litton.jetpack0813

import androidx.lifecycle.MutableLiveData
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        var count1 = MutableLiveData<Int>()
        count1.setValue(5)
        print(count1)

    }
}