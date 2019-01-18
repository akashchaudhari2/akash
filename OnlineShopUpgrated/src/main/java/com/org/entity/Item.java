package com.org.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "itemId")
	private int itemId;

	@NotEmpty
	@Size(min = 6, max = 10)

	private String itemName;

	@NotEmpty
	private String details;

	@NotNull

	private Double price;
	private int quantity;

	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@NotNull
	private Date entryDate;

	@NotEmpty
	@Email
	private String email;

	@NotEmpty
	private String password;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Item(int itemId, String itemName, String details, Double price, int quantity, Date entryDate, String email,
			String password) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.details = details;
		this.price = price;
		this.quantity = quantity;
		this.entryDate = entryDate;
		this.email = email;
		this.password = password;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", details=" + details + ", price=" + price
				+ ", quantity=" + quantity + ", entryDate=" + entryDate + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
	
	
	

	/*	*/

}
