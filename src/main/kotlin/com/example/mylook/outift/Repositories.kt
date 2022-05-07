package com.example.mylook.outift

import org.springframework.data.repository.CrudRepository
import java.util.*


interface OutfitRepository: CrudRepository<Outfit, Int> {
    fun findByTitle(title: String): Outfit?
}
