package com.tighub.stanislavmikheyev.pgsgradessource.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Grade(
    @Id
    val id: Long,

    @ManyToOne
    val student: Student,

    @Column
    val value: String,
)
