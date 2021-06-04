package com.tighub.stanislavmikheyev.pgsgradessource.repository

import com.tighub.stanislavmikheyev.pgsgradessource.entity.Grade
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "grades", path = "grades")
interface GradeRepository: PagingAndSortingRepository<Grade, Long>