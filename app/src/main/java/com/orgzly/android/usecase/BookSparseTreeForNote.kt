package com.orgzly.android.usecase

import com.orgzly.android.data.DataRepository

class BookSparseTreeForNote(val noteId: Long) : UseCase() {
    override fun run(dataRepository: DataRepository): UseCaseResult {
        dataRepository.openBookForNote(noteId, true)

        return UseCaseResult()
    }
}