package com.todo.notes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.notes.entity.ToDo;
import com.todo.notes.exception.ToDoNotFoundException;
import com.todo.notes.repository.TodoRepository;

@RestController
@RequestMapping("/todo")

public class ToDoController {

	@Autowired
	private TodoRepository toDoRepository;

	@GetMapping("/all")
	public Iterable<ToDo> findAllEmployees() {

		return toDoRepository.findAll();

	}

	@GetMapping("/{todoid}")
	public Object findById(@PathVariable int todoid) throws ToDoNotFoundException {

		Optional<ToDo> todo = toDoRepository.findById(todoid);

		if (todo.isPresent()) {
			return todo;
		} else {
			throw new ToDoNotFoundException("Todo Not Found");
		}
	}

	@GetMapping("/user/{userid}")
	public Object findByUserId(@PathVariable int userid) throws ToDoNotFoundException {

		List<ToDo> todo = toDoRepository.findByUserId(userid);

		if (!todo.isEmpty()) {
			return todo;
		} else {
			throw new ToDoNotFoundException("Todouser Not Found");
		}
	}

	@PostMapping("/save")
	public Object addToDo(@RequestBody ToDo todo) throws ToDoNotFoundException {
		toDoRepository.save(todo);
		return toDoRepository.findById(todo.getId());

	}

	@PutMapping("/update/{id}")
	public Object updateToDo(@PathVariable int id, @RequestBody ToDo todo) throws ToDoNotFoundException {
		toDoRepository.save(todo);
		return toDoRepository.findById(id);
	}

	@DeleteMapping("/del/{id}")
	public String deleteToDo(@PathVariable int id) {
		toDoRepository.deleteById(id);
		return "Todo deleted Successfully";
	}
}
