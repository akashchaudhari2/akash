package com.org.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.org.entity.Category;
import com.org.entity.Feedback;
import com.org.entity.Item;
import com.org.entity.OrderOnlineEntity;
import com.org.entity.Payment;
import com.org.entity.User;

@Repository("itemDao")
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public boolean saveItem(Item item) {

		int save = (Integer) hibernateTemplate.save(item);

		if (save > 0) {

			return true;

		} else {

			return false;
		}

	}

	public Item getItemDetailsByEmailAndPassword(String email, String password) {

		DetachedCriteria criteria = DetachedCriteria.forClass(Item.class);

		criteria.add(Restrictions.eq("email", email));
		criteria.add(Restrictions.eq("password", password));

		List<Item> findByCriteria = (List<Item>) hibernateTemplate.findByCriteria(criteria);

		if (findByCriteria != null && findByCriteria.size() > 0) {

			return findByCriteria.get(0);

		}

		return null;
	}

	public boolean saveCategory(Category category) {
		int save = (Integer) hibernateTemplate.save(category);

		if (save > 0) {

			return true;

		} else {

			return false;
		}
	}

	public boolean saveFeedback(Feedback feedback) {
		int save = (Integer) hibernateTemplate.save(feedback);

		if (save > 0) {

			return true;

		} else {

			return false;
		}
	}

	public boolean savePayment(Payment payment) {
		int save = (Integer) hibernateTemplate.save(payment);

		if (save > 0) {

			return true;

		} else {

			return false;
		}
	}

	public boolean saveUser(User user) {
		int save = (Integer) hibernateTemplate.save(user);

		if (save > 0) {

			return true;

		} else {

			return false;
		}
	}

	public boolean saveOrder(OrderOnlineEntity order) {
		int save = (Integer) hibernateTemplate.save(order);

		if (save > 0) {

			return true;

		} else {

			return false;
		}
	}

	public Item selectAll( String itemName) {

		DetachedCriteria criteria = DetachedCriteria.forClass(Item.class);


		criteria.add(Restrictions.eq("itemName", itemName));

		

		List<Item> findByCriteria = (List<Item>) hibernateTemplate.findByCriteria(criteria);
		
		
		if (findByCriteria != null && findByCriteria.size() > 0) {

			return  findByCriteria.get(0);

		}
		
		

		return null;
	}

}
