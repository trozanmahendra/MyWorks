package customEventHandling.beans;

import customEventHandling.publishers.AccountEventPublisher;

public class Account {
	@SuppressWarnings("unused")
	private AccountEventPublisher publisher;

	public void setPublisher(AccountEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void createAccount() {
		System.out.println("*****Account created*****");
		publisher.publish("Account created");
	}

	public void searchAccount() {
		System.out.println("*****Account found*****");
		publisher.publish("Account found");
	}

	public void updateaccount() {
		System.out.println("*****Account updated*****");
		publisher.publish("Account updated");
	}

	public void deleteAccount() {
		System.out.println("*****Account deleted*****");
		publisher.publish("Account deleted");
	}

}
