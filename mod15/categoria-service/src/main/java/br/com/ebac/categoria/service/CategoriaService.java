package br.com.ebac.categoria.service;

import br.com.ebac.categoria.entity.Categoria;
import br.com.ebac.categoria.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria criar(Categoria categoria) {
        return repository.save(categoria);
    }

    public List<Categoria> listarTodos() {
        return repository.findAll();
    }

    public Optional<Categoria> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Categoria atualizar(Long id, Categoria categoria) {
        if (repository.existsById(id)) {
            categoria.setId(id);
            return repository.save(categoria);
        }
        return null;
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
