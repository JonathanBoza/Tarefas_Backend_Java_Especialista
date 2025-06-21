package com.ebac.mod09.repository;

import com.ebac.mod09.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
