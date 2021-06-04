package com.tighub.stanislavmikheyev.pgsgradessource.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Student(
    @Id
    val id: Long,

    @Column
    var name: String,

    @Column
    val surname: String
)
