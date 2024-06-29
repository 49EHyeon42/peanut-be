package com.struc9ture.peanut.repository;

import com.struc9ture.peanut.entity.LetterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LetterJpaRepository extends JpaRepository<LetterEntity, Long> {
}
