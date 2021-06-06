package com.github.stanislavmikheyev.pgsgradessource.repository

import com.github.stanislavmikheyev.pgsgradessource.entity.Student
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
interface StudentRepository : PagingAndSortingRepository<Student, Long>
