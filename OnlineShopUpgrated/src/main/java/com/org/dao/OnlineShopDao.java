package com.org.dao;

import java.util.List;

import com.org.entity.Category;
import com.org.entity.Feedback;
import com.org.entity.Item;
import com.org.entity.OrderOnlineEntity;
import com.org.entity.Payment;
import com.org.entity.User;

public interface OnlineShopDao {

	public void addItem(Item item);

	public void updateItem(Item item);

	public List<Item> listItem();

	public Item ItemById(int id);

	public void removeItem(int id);

	public void addItem(Category category);

	public void addFeedback(Feedback feedback);

	public void addOrder(OrderOnlineEntity order);

	public void addPayment(Payment payment);

	public void addUser(User user);




	


}
