package com.example.mylook.outift

import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/outfits")
class OutfitController(private val repository: OutfitRepository) {
    @GetMapping("/")
    fun list(): MutableIterable<Outfit> {
        val outfits: MutableIterable<Outfit> = repository.findAll()

        return outfits
    }

    @GetMapping("/{id}")
    fun retrieve(@PathVariable id: Int): Optional<Outfit> {
        val outfit: Optional<Outfit> = repository.findById(id)

        return outfit
    }

    @PostMapping("/")
    fun create(): String {
        return "create"
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Int): String {
        return "update"
    }

    @PatchMapping("/{id}")
    fun partialUpdate(@PathVariable id: Int): String {
        return "partial update"
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int) {
        return
    }
}