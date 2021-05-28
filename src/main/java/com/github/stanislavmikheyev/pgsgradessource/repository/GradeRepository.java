package com.github.stanislavmikheyev.pgsgradessource.repository;

import com.github.stanislavmikheyev.pgsgradessource.entity.Grade;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "grades", path = "grades")
public interface GradeRepository extends PagingAndSortingRepository<Grade, Long> {
    List<Grade> findAll();
}
