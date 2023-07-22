package entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="category")
public class Categoryentity extends Baseentity {
@Column(name="name")
private String name;
@Column(name="code")
private String code;

@OneToMany(mappedBy="category")
private List<Newsentity> news=new ArrayList();

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
public List<Newsentity> getNews() {
	return news;
}
public void setNews(List<Newsentity> news) {
	this.news = news;
}

}
