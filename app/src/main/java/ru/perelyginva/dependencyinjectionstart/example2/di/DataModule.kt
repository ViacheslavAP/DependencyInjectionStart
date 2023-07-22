package ru.perelyginva.dependencyinjectionstart.example2.di


 import dagger.Binds
 import dagger.Module
 import ru.perelyginva.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
 import ru.perelyginva.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
 import ru.perelyginva.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
 import ru.perelyginva.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
interface DataModule {

    @Binds
     fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource


    @Binds
     fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}