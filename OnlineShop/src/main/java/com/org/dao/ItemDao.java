package com.org.dao;

import java.util.Date;
import java.util.List;

import com.org.entity.Category;
import com.org.entity.Feedback;
import com.org.entity.Item;
import com.org.entity.OrderOnlineEntity;
import com.org.entity.Payment;
import com.org.entity.User;

public interface ItemDao {

	
	
	boolean saveItem(Item item);
	Item getItemDetailsByEmailAndPassword(String email,String Password);
	boolean saveCategory(Category category);
	
	boolean saveFeedback(Feedback feedback);
	boolean savePayment(Payment payment);
	boolean saveUser(User user);
	boolean saveOrder(OrderOnlineEntity order);
	/*List<Item> selectAll(int itemId,String itemName,String details,Double price,int quantity,Date entryDate);*/
	Item selectAll(String itemName);

	
	
}
