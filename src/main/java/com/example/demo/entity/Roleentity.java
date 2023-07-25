package com.example.demo.entity;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="role")
@Getter
@Setter
public class Roleentity extends Baseentity {

@Column(name="code")
private String code;
@Column(name="name")
private String name;
@ManyToMany(mappedBy="roles")
private List<Userentity> users;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public List<Userentity> getUsers() {
	return users;
}
public void setUsers(List<Userentity> users) {
	this.users = users;
}

}
