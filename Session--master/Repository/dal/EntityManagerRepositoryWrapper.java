package project.study.Repository.dal;

import project.study.model.TodoJpa;
import project.study.Repository.jpa.TodoJpaEntityManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier; // Add this import
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EntityManagerRepositoryWrapper implements TodoRepository {

    private final TodoJpaEntityManagerRepository repo;

    @Autowired
    public EntityManagerRepositoryWrapper(TodoJpaEntityManagerRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<TodoJpa> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<TodoJpa> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public TodoJpa save(TodoJpa todo) {
        return repo.save(todo);
    }

    @Override
    public TodoJpa update(TodoJpa todo) {
        return repo.update(todo);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
