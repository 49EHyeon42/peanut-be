package com.struc9ture.peanut.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "letter")
public class LetterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
