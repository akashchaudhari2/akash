package com.info.app;

import org.hibernate.Session;

import com.info.app.HibernateUtil.HibernateUtil;
import com.info.app.model.Address;
import com.info.app.model.Employee;

public class StoreData {

	public static void main(String[] args) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Employee e = new Employee();
			e.setName("A");
			e.setEmail("prajucta.123@gmail.com");
			e.setSalary(1213.34);

			Employee e1 = new Employee();
			e1.setName("A");
			e1.setEmail("pallavi.123@gmail.com");
			e1.setSalary(3212.25);

			Address address = new Address();
			address.setCity("pune");
			address.setState("mh");
			address.setCountry("india");

			Address address1 = new Address();
			address1.setCity("mumbai");
			address1.setState("mh");
			address1.setCountry("india");

			e.getAddress().add(address);
			e.getAddress().add(address1);

			e1.getAddress().add(address);
			e1.getAddress().add(address1);

			address.getEmployee().add(e);
			address.getEmployee().add(e1);

			address1.getEmployee().add(e);
			address1.getEmployee().add(e1);

			session.beginTransaction();
			session.save(e);
			session.save(e1);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
