package ru.perelyginva.dependencyinjectionstart.example2.data.datasource

import android.util.Log

interface ExampleRemoteDataSource {

    fun method(){
        Log.d(LOG_TAG, "ExampleRemoteDataSource ")
    }
    companion object {

       private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
