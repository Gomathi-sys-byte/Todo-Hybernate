package project.study.Repository.jpa;

import org.springframework.stereotype.Repository;
import project.study.model.TodoJpa;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TodoJpaRepository extends JpaRepository<TodoJpa, Long> {
}
