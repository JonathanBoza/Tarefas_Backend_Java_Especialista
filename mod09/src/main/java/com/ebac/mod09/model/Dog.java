package com.ebac.mod09.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Dog extends Animal {
    private boolean isVaccinated;
    private String size; // Small, Medium, Large
}
