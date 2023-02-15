package com.todo.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.todo.user.VO.ResponseTemplateVO;
import com.todo.user.VO.ToDo;
import com.todo.user.entity.User;
import com.todo.user.repo.TodoUserRepository;

@Service
public class UserService {

	@Autowired
	private TodoUserRepository toDoUserRepository;

	@Autowired
	private RestTemplate restTemplate;

	public ResponseEntity<ResponseTemplateVO> findUserWithTodo(int id) {
		ResponseTemplateVO vo = new ResponseTemplateVO();

		Optional<User> user = toDoUserRepository.findById(id);
		User toDoUser = user.get();
		ToDo[] toDo = restTemplate.getForObject("http://localhost:20000/todo/user/" + user.get().getUserId(),
				ToDo[].class);

		System.out.println(toDo.toString());

		vo.setToDo(toDo);
		vo.setToDoUser(toDoUser);
		return new ResponseEntity<>(vo, HttpStatus.ACCEPTED);

	}

}
