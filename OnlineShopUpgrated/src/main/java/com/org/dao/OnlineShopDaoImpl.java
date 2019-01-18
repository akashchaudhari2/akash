package com.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.entity.Category;
import com.org.entity.Feedback;
import com.org.entity.Item;
import com.org.entity.OrderOnlineEntity;
import com.org.entity.Payment;
import com.org.entity.User;

@Repository
public class OnlineShopDaoImpl implements OnlineShopDao {

	private static final Logger log = LoggerFactory.getLogger(OnlineShopDaoImpl.class);

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addItem(Item item) {

		Session session = this.sessionFactory.getCurrentSession();
		session.save(item);

		log.info("Item Added Successfully,Item Details" + item);

	}

	public void updateItem(Item item) {

		Session session = this.sessionFactory.getCurrentSession();
		session.update(item);

		log.info("Item Updated Successfully,Item Details" + item);

	}

	public List<Item> listItem() {

		Session session = this.sessionFactory.getCurrentSession();

		List<Item> list = session.createQuery("from item").list();

		for (Item item : list) {

			log.info("Item List:" + item);

		}

		return list;
	}

	public Item ItemById(int id) {

		Session session = this.sessionFactory.getCurrentSession();

		Item item = session.load(Item.class, new Integer(id));

		/*	
			*/

		log.info("Item Loaded Successfully,Item Details" + item);

		return item;
	}

	public void removeItem(int id) {

		Session session = this.sessionFactory.getCurrentSession();

		Item item = session.load(Item.class, new Integer(id));

		if (item != null) {

			session.delete(item);
		}

		log.info("Item deleted Successfully,Item Details" + item);

	}

	public void addItem(Category category) {

		Session session = this.sessionFactory.getCurrentSession();
		session.save(category);

		log.info("Item Added Successfully,Item Details" + category);

	}

	public void addFeedback(Feedback feedback) {

		Session session = this.sessionFactory.getCurrentSession();
		session.save(feedback);

		log.info("Item Added Successfully,Item Details" + feedback);

	}

	public void addOrder(OrderOnlineEntity order) {

		Session session = this.sessionFactory.getCurrentSession();
		session.save(order);

		log.info("Item Added Successfully,Item Details" + order);

	}

	public void addPayment(Payment payment) {

		Session session = this.sessionFactory.getCurrentSession();
		session.save(payment);

		log.info("Item Added Successfully,Item Details" + payment);

	}

	public void addUser(User user) {

		
		Session session = this.sessionFactory.getCurrentSession();
		session.save(user);

		log.info("Item Added Successfully,Item Details" + user);
		
		
	}

}
