package com.mgBusiness.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgBusiness.beans.ChildWishBean1;
import com.mgBusiness.beans.ChildWishBean2;
import com.mgBusiness.beans.ChildWishBean3;
import com.mgBusiness.beans.WishBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context;
		try {
			 context = new ClassPathXmlApplicationContext("com/mgBusiness/resourses/applicationContext.xml");
			WishBean wishBean = (WishBean)context.getBean("wishBean");
			System.out.println(wishBean.wishing());
			
			ChildWishBean1 c1 = (ChildWishBean1)context.getBean("ChildWishBean1");
			System.out.println(c1.wishing());
			
			ChildWishBean2 c2 = (ChildWishBean2)context.getBean("ChildWishBean2");
			System.out.println(c2.wishing());
			
			ChildWishBean3 c3 = (ChildWishBean3)context.getBean("ChildWishBean3");
			System.out.println(c3.wishing());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
