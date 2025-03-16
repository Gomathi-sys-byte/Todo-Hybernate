package project.study.Repository.dal;

import project.study.model.TodoJpa;

import java.util.List;
import java.util.Optional;

public interface TodoRepository {
    List<TodoJpa> findAll();
    Optional<TodoJpa> findById(Long id);
    TodoJpa save(TodoJpa todo);
    TodoJpa update(TodoJpa todo);
    void deleteById(Long id);
}
