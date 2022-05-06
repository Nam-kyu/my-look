package com.example.mylook.outift

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/outfits")
class OutfitController {
    @GetMapping("/")
    fun list(): String {
        return "list"
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