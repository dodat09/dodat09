package entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="role")
public class Roleentity extends Baseentity {
@Column(name="name")
private String name;
@Column(name="code")
private String code;

@ManyToMany(mappedBy="tags")
private List<Userentity> users= new ArrayList();
public List<Userentity> getUsers() {
	return users;
}
public void setUsers(List<Userentity> users) {
	this.users = users;
}
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


}
