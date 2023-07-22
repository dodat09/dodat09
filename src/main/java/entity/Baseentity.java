package entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Baseentity {
	@Id //trong anto này thì nó có tích hợp notnull và primary sẵn rồi
	@GeneratedValue(strategy= GenerationType.IDENTITY)//thuộc tính tự tăng
	private long id;
    @Column(name="createBy")
	private String createdBy;
    
    @Column(name="createDate")
	private Date createDate;
    
    @Column(name="modifiedBy")
	private String modifiedBy;
 
    @Column(name="modifiedBy")
	private Date modifiedDate;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public long getId() {
		return id;
	}
    
}
