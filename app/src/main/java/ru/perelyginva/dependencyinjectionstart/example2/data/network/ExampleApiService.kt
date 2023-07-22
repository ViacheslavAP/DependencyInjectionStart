package ru.perelyginva.dependencyinjectionstart.example2.data.network

import android.content.Context
import android.util.Log
import ru.perelyginva.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeMillis: Long) {

    fun method() {
        Log.d(LOG_TAG,
            "ExampleLocalDataSource ${context.getString(R.string.app_name)} $timeMillis")
    }
    companion object {
        const val LOG_TAG = "EXAMPLE_TEST"
    }
}
