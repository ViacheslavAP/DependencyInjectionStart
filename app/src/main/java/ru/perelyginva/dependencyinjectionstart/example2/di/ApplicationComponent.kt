package ru.perelyginva.dependencyinjectionstart.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.perelyginva.dependencyinjectionstart.example2.presentation.MainActivity
import ru.perelyginva.dependencyinjectionstart.example2.presentation.MainActivity2
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)
    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface ApplicationComponentFactory{
        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}