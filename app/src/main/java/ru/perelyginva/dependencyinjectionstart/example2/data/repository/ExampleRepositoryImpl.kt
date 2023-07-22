package ru.perelyginva.dependencyinjectionstart.example2.data.repository

import ru.perelyginva.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import ru.perelyginva.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import ru.perelyginva.dependencyinjectionstart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {

    }
}
