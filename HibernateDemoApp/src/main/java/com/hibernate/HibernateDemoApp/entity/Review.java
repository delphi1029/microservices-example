package com.hibernate.HibernateDemoApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="comment")
	private String comment;
	
	@ManyToOne
	@JoinColumn
	private Course course;


	public Review(String comment) {
		super();
		this.comment = comment;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Review [id=" + id + ", comment=" + comment + ", course=" + course + "]";
	}
	
	
	
}
