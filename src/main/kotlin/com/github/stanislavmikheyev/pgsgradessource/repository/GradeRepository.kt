package com.github.stanislavmikheyev.pgsgradessource.repository

import com.github.stanislavmikheyev.pgsgradessource.entity.Grade
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "grades", path = "grades")
interface GradeRepository : PagingAndSortingRepository<Grade, Long>