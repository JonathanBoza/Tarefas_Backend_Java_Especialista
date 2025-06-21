package com.ebac.mod09.repository;

import com.ebac.mod09.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {
}
