package com.org.service;

import java.util.List;

import com.org.entity.Category;
import com.org.entity.Feedback;
import com.org.entity.Item;
import com.org.entity.OrderOnlineEntity;
import com.org.entity.Payment;
import com.org.entity.User;

public interface OnlineShopService {

	
	
	
	public void addItem(Item item);

	public void updateItem(Item item);

	public List<Item> listItem();

	public Item ItemById(int id);

	public void removeItem(int id);

	public void addItemCategory(Category category);

	public void registerfeedback(Feedback feedback);

	public void registerOrder(OrderOnlineEntity order);

	public void registerPayment(Payment payment);

	public void registerUser(User user);
	
	
}
