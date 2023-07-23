package ru.perelyginva.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import ru.perelyginva.dependencyinjectionstart.example2.domain.ExampleRepository
import ru.perelyginva.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject


class ExampleViewModel2 @Inject constructor(
    private val exampleRepository: ExampleRepository
): ViewModel( ) {

    fun method() {
        exampleRepository.method()
    Log.d("ExampleViewModel2", "$this")
    }
}
