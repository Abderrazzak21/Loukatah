package com.example.loukatah.domain.usecase

import com.example.loukatah.data.repository.ItemRepository
import javax.inject.Inject

class DeleteItemUseCase @Inject constructor(
    private val repository: ItemRepository
) {
    suspend operator fun invoke(itemId: String) = repository.deleteItem(itemId)
}
