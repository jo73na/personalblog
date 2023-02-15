package com.todo.user.repo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.todo.user.VO.ResponseTemplateVO;
import com.todo.user.VO.ToDo;
import com.todo.user.entity.User;

@Repository
public interface TodoUserRepository extends CrudRepository<User, Integer>{

	

	

	


}
