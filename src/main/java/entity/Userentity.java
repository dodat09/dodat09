package entity;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class Userentity extends Baseentity{
	@Column(name="username")
    private String username;
	@Column(name="password")
    private String password;
	@Column(name="fullname")
    private String fullname;
	@Column(name="status")
    private int status;
	
	@ManyToMany
	@JoinTable(name="user_role",
	           joinColumns=@JoinColumn(name="user_id"),
	           inverseJoinColumns=@JoinColumn(name="role_id"))
	private List<Roleentity> roles= new ArrayList();
	
	
	public List<Roleentity> getRoles() {
		return roles;
	}
	public void setRoles(List<Roleentity> roles) {
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
