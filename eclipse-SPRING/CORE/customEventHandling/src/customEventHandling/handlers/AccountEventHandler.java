package customEventHandling.handlers;

import org.springframework.context.ApplicationListener;

import customEventHandling.events.AccountEvent;

public class AccountEventHandler implements ApplicationListener<AccountEvent> {

	@Override
	public void onApplicationEvent(AccountEvent accountEvent) {
		accountEvent.generateLog();
	}

}
