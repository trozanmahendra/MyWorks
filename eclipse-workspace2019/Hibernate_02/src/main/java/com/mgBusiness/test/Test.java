package com.mgBusiness.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mgBusiness.entity.Account;
import com.mgBusiness.entity.Employee;

public class Test {

	public static void main(String[] args) {
		var employee1 = new Employee("Mahendra", 50000.000f, "knl");
		var employee2 = new Employee("Bharath", 60000.000f, "hyd");
		var employee3 = new Employee("Surendra", 70000.000f, "tpty");
		var employee4 = new Employee("lakshmanna", 80000.000f, "kphb");
		
		Employee[] obj = {employee1,employee2,employee3,employee4};
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		for(int i=0;i<obj.length;i++) {
			session.save(obj[i]);
			}
		session.save(new Account("mgb1", "Mahendra", "Banglore"));
		
		tx.commit();
		session.close();
		System.out.println(employee1);

	}

}

