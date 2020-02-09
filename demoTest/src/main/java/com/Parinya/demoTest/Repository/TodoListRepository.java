package com.Parinya.demoTest.Repository;

import com.Parinya.demoTest.Entity.TodoList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:15432/")
public interface TodoListRepository extends JpaRepository<TodoList, Long> {

}