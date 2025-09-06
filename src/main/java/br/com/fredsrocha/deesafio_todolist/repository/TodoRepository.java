package br.com.fredsrocha.deesafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fredsrocha.deesafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
