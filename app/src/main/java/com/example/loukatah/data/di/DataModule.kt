package com.example.loukatah.data.di

import com.example.loukatah.data.remote.FirebaseItemDataSource
import com.example.loukatah.data.repository.ItemRepository
import com.example.loukatah.data.repository.ItemRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideFirebaseItemDataSource(): FirebaseItemDataSource {
        return FirebaseItemDataSource()
    }

    @Provides
    @Singleton
    fun provideItemRepository(
        firebaseItemDataSource: FirebaseItemDataSource
    ): ItemRepository {
        return ItemRepositoryImpl(firebaseItemDataSource)
    }
}
