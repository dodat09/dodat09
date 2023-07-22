package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="new")
public class Newsentity extends Baseentity{
	@Column(name="title")
	private String title;
	@Column(name="thumbnail")
	private String thumbnail;
	@Column(name="shortdecription")
	private String shortdescription;
	@Column(name="content")
	private String content;
	@Column(name="categoryid")
	private String categoryid;
	public String getTitle() {
		return title;
	}
	@ManyToOne
	@JoinColumn(name="category_id")
	private Categoryentity category;
	
	public void setTitle(String title) {
		this.title = title;
	}
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
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public Categoryentity getCategory() {
		return category;
	}
	public void setCategory(Categoryentity category) {
		this.category = category;
	}

	
	
	
}
