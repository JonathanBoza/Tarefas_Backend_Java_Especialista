package com.ebac.mod09.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Cat extends Animal {
    private boolean isNeutered;
    private boolean isIndoor;
}
