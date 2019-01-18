package com.org.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.ItemDao;
import com.org.entity.Category;
import com.org.entity.Feedback;
import com.org.entity.Item;
import com.org.entity.OrderOnlineEntity;
import com.org.entity.Payment;
import com.org.entity.User;

@Service("onlineService")
public class OnlineServiceImpl implements OnlineService {

	@Autowired
	private ItemDao itemDao;

	public ItemDao getItemDao() {
		return itemDao;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public Item validateItemService(String email, String password) {

		Item item = getItemDao().getItemDetailsByEmailAndPassword(email, password);

		return item;
	}

	public boolean registerItem(Item item) {

		boolean isRegister = false;

		boolean saveItem = getItemDao().saveItem(item);

		if (saveItem) {

			isRegister = true;

		}

		return isRegister;
	}

	public boolean registerCategory(Category category) {

		boolean isRegister = false;

		boolean saveItem = getItemDao().saveCategory(category);

		if (saveItem) {

			isRegister = true;

		}

		return isRegister;

	}

	public boolean registerfeedback(Feedback feedback) {

		boolean isRegister = false;

		boolean saveItem = getItemDao().saveFeedback(feedback);

		if (saveItem) {

			isRegister = true;

		}

		return isRegister;
	}

	public boolean registerPayment(Payment payment) {
		boolean isRegister = false;

		boolean saveItem = getItemDao().savePayment(payment);

		if (saveItem) {

			isRegister = true;

		}

		return isRegister;
	}

	public boolean registerUser(User user) {

		boolean isRegister = false;

		boolean saveItem = getItemDao().saveUser(user);

		if (saveItem) {

			isRegister = true;

		}

		return isRegister;
	}

	public boolean registerOrder(OrderOnlineEntity order) {
		boolean isRegister = false;

		boolean saveItem = getItemDao().saveOrder(order);

		if (saveItem) {

			isRegister = true;

		}

		return isRegister;
	}

	public Item findItemByName(String itemName) {
		
		
		
	
		return itemDao.selectAll(itemName);
	}



}
