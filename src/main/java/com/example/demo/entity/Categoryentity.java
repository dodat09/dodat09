package com.example.demo.entity;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="category")

@NoArgsConstructor
public class Categoryentity extends Baseentity {

@Column(name="code")
private String code;
@Column(name="name")
private String name;
@OneToMany(mappedBy="category")
private List<Newsentity> news;

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
