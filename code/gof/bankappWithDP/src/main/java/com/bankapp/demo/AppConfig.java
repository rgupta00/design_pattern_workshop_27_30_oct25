package com.bankapp.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.bankapp.demo")
public class AppConfig {
//
//	@Bean
//	@Scope("singleton")
//	 Car getCar(Tyre tyre) {
//		return new Car(tyre);
//	}
//	@Bean
//	@Scope("prototype")
//	 Tyre getTyre() {
//		return new MrfTyre();
//	}
}
