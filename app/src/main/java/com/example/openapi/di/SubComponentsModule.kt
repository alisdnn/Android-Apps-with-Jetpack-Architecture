package com.example.openapi.di

import com.example.openapi.di.auth.AuthComponent
import com.example.openapi.di.main.MainComponent
import dagger.Module

@Module(
    subcomponents = [
        AuthComponent::class,
        MainComponent::class
    ]
)
class SubComponentsModule