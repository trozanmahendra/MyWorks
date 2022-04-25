package customEventHandling.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import customEventHandling.beans.Account;

public class Test {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"customEventHandling/resources/applicationContext.xml")) {
			Account account = (Account) context.getBean("account");
			account.createAccount();
			account.searchAccount();
			account.updateaccount();
			account.deleteAccount();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
