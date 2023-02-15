package com.todo.user.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.user.VO.ResponseTemplateVO;
import com.todo.user.entity.User;
import com.todo.user.exceptions.UserNotFoundException;
import com.todo.user.repo.TodoUserRepository;
import com.todo.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private TodoUserRepository toDoUserRepository;
	@Autowired
	private UserService userService;

	@GetMapping("/all")
	public Iterable<User> findAllUser() {

		return toDoUserRepository.findAll();

	}

	@GetMapping("/{id}")
	public Object findById(@PathVariable int id) throws UserNotFoundException {

		Optional<User> toDoUser = toDoUserRepository.findById(id);

		if (toDoUser.isPresent()) {
			return toDoUser;
		} else {
			throw new UserNotFoundException("TodoUser Not Found");
		}
	}

	@PostMapping("/save")
	public Object addToDo(@RequestBody User toDoUser) {
		return toDoUserRepository.save(toDoUser);

	}

	@PutMapping("/update/{id}")
	public Object updateToDo(@PathVariable int id, @RequestBody User toDoUser) throws UserNotFoundException {
		return toDoUserRepository.save(toDoUser);

	}

	@DeleteMapping("/del/{id}")
	public String deleteToDoUser(@PathVariable int id) {
		toDoUserRepository.deleteById(id);
		return "TodoUSer deleted Successfully";
	}
	
	@GetMapping("/usertodo/{id}")
		public ResponseEntity<ResponseTemplateVO> findUserWithTodo(@PathVariable int id) {

		return userService.findUserWithTodo(id);

	}
	
	@GetMapping("/{emailid}/{}")
	public Object loginByMail(@PathVariable int id) throws UserNotFoundException {

		Optional<User> toDoUser = toDoUserRepository.findById(id);

		if (toDoUser.isPresent()) {
			return toDoUser;
		} else {
			throw new UserNotFoundException("TodoUser Not Found");
		}
	}
	

}
