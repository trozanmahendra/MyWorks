package customEventHandling.publishers;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import customEventHandling.events.AccountEvent;

public class AccountEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	public void publish(String mesaage) {
		AccountEvent ae = new AccountEvent(this, mesaage);
		publisher.publishEvent(ae);
	}

}
