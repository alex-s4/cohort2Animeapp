package com.alexproject.cohort2Animeapp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="acharacters")
public class AnimeCharacter {

	// id (Long)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String c_name;
	private Integer c_level;
	private String c_image;
	private Integer c_age;
	private Boolean c_isAlive;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	public AnimeCharacter() {
		
	}

	public AnimeCharacter(String c_name, Integer c_level, String c_image, Integer c_age, Boolean c_isAlive) {
		super();
		this.c_name = c_name;
		this.c_level = c_level;
		this.c_image = c_image;
		this.c_age = c_age;
		this.c_isAlive = c_isAlive;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public Integer getC_level() {
		return c_level;
	}

	public void setC_level(Integer c_level) {
		this.c_level = c_level;
	}

	public String getC_image() {
		return c_image;
	}

	public void setC_image(String c_image) {
		this.c_image = c_image;
	}

	public Integer getC_age() {
		return c_age;
	}

	public void setC_age(Integer c_age) {
		this.c_age = c_age;
	}

	public Boolean getC_isAlive() {
		return c_isAlive;
	}

	public void setC_isAlive(Boolean c_isAlive) {
		this.c_isAlive = c_isAlive;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	
	
}
