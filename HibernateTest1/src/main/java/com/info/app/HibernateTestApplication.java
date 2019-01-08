package com.info.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.jaxb.hbm.spi.Adapter3;
import org.hibernate.query.Query;

import com.info.app.HibernateUtil.HibernateUtil;
import com.info.app.model.Address;
import com.info.app.model.Employee;

public class HibernateTestApplication {

	public static void main(String args[]) {

		// getAllEmployees();
		// getAllEmpoyeesIdAndName();
		// getEmployeeById();

		// updateEmployeeRecords();
		// deleteEmployeeRecords();

		// aggregatefunction();

		 hqlwithGroupByCaluse();

	}

	private static void hqlwithGroupByCaluse() {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			String HQL = "select addr.country,sum(emp.salary) from Address addr LEFT JOIN addr.employee emp"
					+ " GROUP BY addr"
					+ " having sum(emp.salary)>1000";

			Query<Object[]> query = session.createQuery(HQL, Object[].class);
			List<Object[]> list = query.list();

			for (Object[] objects : list) {

				String country = (String) objects[0];
				Double toalsal = (Double) objects[1];

				System.out.println(country + "Country Name");
				System.out.println(toalsal + "Total Salary");

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	private static void aggregatefunction() {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			String HQL = "select count(e),avg(e.salary),min(e.salary),sum(e.salary) from Employee e";
			Query<Object[]> query = session.createQuery(HQL, Object[].class);
			List<Object[]> list = query.list();
			for (Object[] objects : list) {
				Long empCount = (Long) objects[0];
				Double avgSal = (Double) objects[1];
				Double minSal = (Double) objects[2];
				Double sumSal = (Double) objects[3];

				System.out.println("Total Employees" + empCount);
				System.out.println("Average Salary" + avgSal);
				System.out.println("Minimum Salary" + minSal);
				System.out.println("Sum of Salary" + sumSal);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void deleteEmployeeRecords() {

		int id = 1;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			String HQL = "delete from Employee where id=:id";

			Query query = session.createQuery(HQL);
			query.setParameter("id", id);

			session.beginTransaction();
			int executeUpdate = query.executeUpdate();
			session.getTransaction().commit();

			if (executeUpdate > 0) {

				System.out.println("Employee is Deleted");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void updateEmployeeRecords() {
		int id = 2;
		String newEmail = " shital.123@gmail.com";
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			String HQL = "update Employee set email=:email where id=:id";

			Query query = session.createQuery(HQL);
			query.setParameter("id", id);
			query.setParameter("email", newEmail);
			session.beginTransaction();
			int executeUpdate = query.executeUpdate();
			// session.getTransaction().commit();

			if (executeUpdate > 0) {

				System.out.println("Employee Email is updated");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void getEmployeeById() {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			int id = 2;

			String HQL = " from Employee where id=:id ";
			Query<Employee> query = session.createQuery(HQL, Employee.class);
			query.setParameter("id", id);

			Employee employee = query.uniqueResult();
			System.out.println(employee);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private static void getAllEmpoyeesIdAndName() {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			String HQL = "select id,name from Employee";
			Query query = session.createQuery(HQL);
			List<Object[]> list = query.list();
			for (Object[] objects : list) {

				Integer id = (Integer) objects[0];
				String name = (String) objects[1];

				System.out.println(id + "\t" + name);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void getAllEmployees() {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			String HQL = "select name from Employee";
			Query<String> query = session.createQuery(HQL);
			query.list().forEach(System.out::println);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
