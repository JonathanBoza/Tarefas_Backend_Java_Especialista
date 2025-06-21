package com.ebac.mod09.controller;

import com.ebac.mod09.model.Cat;
import com.ebac.mod09.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cats")
public class CatController {
    @Autowired
    private CatRepository catRepository;

    @GetMapping
    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cat> getCatById(@PathVariable Long id) {
        return catRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cat createCat(@RequestBody Cat cat) {
        return catRepository.save(cat);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cat> updateCat(@PathVariable Long id, @RequestBody Cat cat) {
        if (!catRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        cat.setId(id);
        return ResponseEntity.ok(catRepository.save(cat));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCat(@PathVariable Long id) {
        if (!catRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        catRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
