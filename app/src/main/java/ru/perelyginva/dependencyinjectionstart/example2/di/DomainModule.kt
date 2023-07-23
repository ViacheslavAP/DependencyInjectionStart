package ru.perelyginva.dependencyinjectionstart.example2.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.perelyginva.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import ru.perelyginva.dependencyinjectionstart.example2.domain.ExampleRepository

@Module
interface DomainModule {


    @Binds
      fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}