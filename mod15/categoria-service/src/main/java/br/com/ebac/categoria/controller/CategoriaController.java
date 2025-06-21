package br.com.ebac.categoria.controller;

import br.com.ebac.categoria.entity.Categoria;
import br.com.ebac.categoria.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @PostMapping
    public ResponseEntity<Categoria> criar(@RequestBody Categoria categoria) {
        return ResponseEntity.ok(service.criar(categoria));
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categoria> atualizar(@PathVariable Long id, @RequestBody Categoria categoria) {
        Categoria atualizado = service.atualizar(id, categoria);
        if (atualizado != null) {
            return ResponseEntity.ok(atualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
