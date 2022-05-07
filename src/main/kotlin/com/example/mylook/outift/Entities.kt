package com.example.mylook.outift

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class Outfit(
    var title: String,
    @Id @GeneratedValue val id: Int? = null
)