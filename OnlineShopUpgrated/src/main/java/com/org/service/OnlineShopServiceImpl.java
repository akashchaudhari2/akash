package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.dao.OnlineShopDao;
import com.org.entity.Category;
import com.org.entity.Feedback;
import com.org.entity.Item;
import com.org.entity.OrderOnlineEntity;
import com.org.entity.Payment;
import com.org.entity.User;

@Service
public class OnlineShopServiceImpl implements OnlineShopService {

	private OnlineShopDao onlineShopDao;

	public OnlineShopDao getOnlineShopDao() {
		return onlineShopDao;
	}

	public void setOnlineShopDao(OnlineShopDao onlineShopDao) {
		this.onlineShopDao = onlineShopDao;
	}

	@Transactional
	public void addItem(Item item) {

		this.onlineShopDao.addItem(item);

	}

	@Transactional
	public void updateItem(Item item) {

		this.onlineShopDao.updateItem(item);

	}

	@Transactional
	public List<Item> listItem() {

		return this.onlineShopDao.listItem();
	}

	@Transactional
	public Item ItemById(int id) {
		// TODO Auto-generated method stub

		Item itemById = this.onlineShopDao.ItemById(id);

		return itemById;
	}

	@Transactional
	public void removeItem(int id) {

		this.onlineShopDao.removeItem(id);

	}

	@Transactional
	public void addItemCategory(Category category) {


		
		this.onlineShopDao.addItem(category);
		
	}

	@Transactional
	public void registerfeedback(Feedback feedback) {

		
		this.onlineShopDao.addFeedback(feedback);
		
		
	}

	@Transactional
	public void registerOrder(OrderOnlineEntity order) {

		
		this.onlineShopDao.addOrder(order);
		
	}

	@Transactional
	public void registerPayment(Payment payment) {

		
		
		this.onlineShopDao.addPayment(payment);
		
	}

	@Transactional
	public void registerUser(User user) {
	
		
		
		this.onlineShopDao.addUser(user);
		
	}

}
