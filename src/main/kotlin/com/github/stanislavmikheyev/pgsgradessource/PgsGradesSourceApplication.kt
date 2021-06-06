package com.github.stanislavmikheyev.pgsgradessource

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class PgsGradesSourceApplication

fun main(args: Array<String>) {
    runApplication<PgsGradesSourceApplication>(*args)
}
