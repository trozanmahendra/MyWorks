package com.mgBusiness.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mgBusiness.beans.WelcomeBean;

@Configuration
public class AppConfig {
	@Bean
	public WelcomeBean welcomeBean() {
		return new WelcomeBean();
	}

}
