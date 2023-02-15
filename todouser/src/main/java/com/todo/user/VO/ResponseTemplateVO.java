package com.todo.user.VO;

import java.util.Arrays;

import com.todo.user.entity.User;


public class ResponseTemplateVO {

	private ToDo toDo[];
	private User toDoUser;
	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseTemplateVO(ToDo[] toDo, User toDoUser) {
		super();
		this.toDo = toDo;
		this.toDoUser = toDoUser;
	}
	public ToDo[] getToDo() {
		return toDo;
	}
	public void setToDo(ToDo[] toDo) {
		this.toDo = toDo;
	}
	public User getToDoUser() {
		return toDoUser;
	}
	public void setToDoUser(User toDoUser) {
		this.toDoUser = toDoUser;
	}
	@Override
	public String toString() {
		return "ResponseTemplateVO [User=" +toDoUser+ ", toDo="+Arrays.toString(toDo) + "]";
	}
	
	
	
}
