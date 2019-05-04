package com.nikitamaslov.di.module.common

import com.nikitamaslov.di.module.core.CoreModule
import com.nikitamaslov.di.module.repository.RepositoryModule
import dagger.Module

@Module(
    includes = [
        CoreModule::class,
        RepositoryModule::class
    ]
)
abstract class AppModule
