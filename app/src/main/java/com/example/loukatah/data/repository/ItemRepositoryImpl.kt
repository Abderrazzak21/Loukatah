package com.example.loukatah.data.repository

import com.example.loukatah.data.model.Item
import com.example.loukatah.data.remote.FirebaseItemDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ItemRepositoryImpl @Inject constructor(
    private val firebaseItemDataSource: FirebaseItemDataSource
) : ItemRepository {

    override fun getItems(): Flow<List<Item>> {
        return firebaseItemDataSource.getItems()
    }

    override suspend fun addItem(item: Item) {
        firebaseItemDataSource.addItem(item)
    }

    override suspend fun updateItem(item: Item) {
        firebaseItemDataSource.updateItem(item)
    }

    override suspend fun deleteItem(itemId: String) {
        firebaseItemDataSource.deleteItem(itemId)
    }
}
