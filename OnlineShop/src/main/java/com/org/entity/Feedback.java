package com.org.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="feedbackId")
	private int feedbackId;
	
	@NotEmpty
	private String userName;
	
	@NotEmpty
	private String message;
	

	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@NotNull
	private Date entryDate;

	public Feedback(int feedbackId, String userName, String message, Date entryDate) {
		super();
		this.feedbackId = feedbackId;
		this.userName = userName;
		this.message = message;
		this.entryDate = entryDate;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
