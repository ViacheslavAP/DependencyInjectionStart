package ru.perelyginva.dependencyinjectionstart.example2.di

import android.app.Application

class ExampleApp: Application() {

     val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}