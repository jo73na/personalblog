package com.todo.notes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todo.notes.entity.ToDo;


@Repository
public interface TodoRepository extends CrudRepository<ToDo, Integer>{

	List<ToDo> findByUserId(int userid);

	


}
