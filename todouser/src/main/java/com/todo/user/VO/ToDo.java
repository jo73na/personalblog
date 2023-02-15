package com.todo.user.VO;

public class ToDo {
	int id;
	String des;
	Boolean code;
	int userId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Boolean getCode() {
		return code;
	}

	public void setCode(Boolean code) {
		this.code = code;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

	public ToDo(int id, String des, Boolean code, int userId) {
		super();
		this.id = id;
		this.des = des;
		this.code = code;
		this.userId = userId;
	}

	public ToDo() {
		super();
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", des=" + des + ", code=" + code + ", userId=" + userId + "]";
	}
	
	
	
}
