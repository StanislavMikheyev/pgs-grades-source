package com.tighub.stanislavmikheyev.pgsgradessource.repository

import com.tighub.stanislavmikheyev.pgsgradessource.entity.Student
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
interface StudentRepository: PagingAndSortingRepository<Student, Long>
