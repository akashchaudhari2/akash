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

@SuppressWarnings("deprecation")
@Entity
@Table(name = "orderentity")
public class OrderOnlineEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderId")
	private int orderId;
	
	@NotEmpty
	private String userName;
	
	@NotEmpty
	private String itemName;
	
	
	private int quantity;
	
	@NotNull
	private Double price;
	
	@NotEmpty
	private String status;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@NotNull
	private Date entryDate;
	
	
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public OrderOnlineEntity(int orderId, String userName, String itemName, int quantity, Double price, String status,
			Date entryDate) {
		super();
		this.orderId = orderId;
		this.userName = userName;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
		this.entryDate = entryDate;
	}
	public OrderOnlineEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
