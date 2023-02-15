package com.todo.notes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "todo")
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "todoid")
	int id;

	@Column(name = "tododes")
	String des;
	@Column(name = "todostatus")
	Boolean code;
	@Column(name = "userid")
	int userId;

	public ToDo() {
		super();
	}

	public ToDo(String des, Boolean code, int userId) {
		super();
		this.des = des;
		this.code = code;
		this.userId = userId;
	}

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

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", des=" + des + ", code=" + code + ", userId=" + userId + "]";
	}

}