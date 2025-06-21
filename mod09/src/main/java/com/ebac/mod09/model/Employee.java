package com.ebac.mod09.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;

    @OneToMany(mappedBy = "rescuedBy")
    private List<Animal> rescuedAnimals;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Animal> getRescuedAnimals() {
        return rescuedAnimals;
    }

    public void setRescuedAnimals(List<Animal> rescuedAnimals) {
        this.rescuedAnimals = rescuedAnimals;
    }
}
