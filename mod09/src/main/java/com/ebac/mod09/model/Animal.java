package com.ebac.mod09.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String breed;
    private int age;
    private String color;
    private LocalDateTime rescueDate;

    @ManyToOne
    @JoinColumn(name = "rescued_by_id")
    private Employee rescuedBy;

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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getRescueDate() {
        return rescueDate;
    }

    public void setRescueDate(LocalDateTime rescueDate) {
        this.rescueDate = rescueDate;
    }

    public Employee getRescuedBy() {
        return rescuedBy;
    }

    public void setRescuedBy(Employee rescuedBy) {
        this.rescuedBy = rescuedBy;
    }
}
