package com.ebac.mod09.controller;

import com.ebac.mod09.model.Dog;
import com.ebac.mod09.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dogs")
public class DogController {
    @Autowired
    private DogRepository dogRepository;

    @GetMapping
    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dog> getDogById(@PathVariable Long id) {
        return dogRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Dog createDog(@RequestBody Dog dog) {
        return dogRepository.save(dog);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dog> updateDog(@PathVariable Long id, @RequestBody Dog dog) {
        if (!dogRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        dog.setId(id);
        return ResponseEntity.ok(dogRepository.save(dog));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDog(@PathVariable Long id) {
        if (!dogRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        dogRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
