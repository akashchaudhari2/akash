package com.org.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.entity.Category;
import com.org.entity.Feedback;
import com.org.entity.Item;
import com.org.entity.OrderOnlineEntity;
import com.org.entity.Payment;
import com.org.entity.User;

public interface OnlineService {

	Item validateItemService(String email, String password);

	public boolean registerItem(Item item);

	public boolean registerCategory(Category category);

	public boolean registerfeedback(Feedback feedback);

	boolean registerPayment(Payment payment);

	boolean registerUser(User user);

	boolean registerOrder(OrderOnlineEntity order);

	Item findItemByName(String itemName);

}
