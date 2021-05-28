package com.github.stanislavmikheyev.pgsgradessource.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Grade {
    @Id
    private Long id;

    @Column
    private String value;
}
