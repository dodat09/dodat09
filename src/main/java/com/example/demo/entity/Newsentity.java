package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="new")
@Getter
@Setter
@NoArgsConstructor
public class Newsentity extends Baseentity{
	@Column(name="title")
	private String title;
	@Column(name="thumbnail")
	private String thumbnail;
	@Column(name="shortdescription")
	private String shortdescription;
	@Column(name="content")
	private String content;
	
	
	@ManyToOne
	@JoinColumn(name="categoryid")
	private Categoryentity category;
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getShortdescription() {
		return shortdescription;
	}
	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Categoryentity getCategory() {
		return category;
	}
	public void setCategory(Categoryentity category) {
		this.category = category;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
}
