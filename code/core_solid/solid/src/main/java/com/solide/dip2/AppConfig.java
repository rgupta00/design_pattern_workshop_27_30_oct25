package com.solide.dip2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.solide.dip2")
public class AppConfig {
	
//	@Bean
//	public Tyre tyre() {
//		return new MrfTyre();
//	}
//
//	@Bean
//	@Scope("prototype")
//	public Car car(Tyre tyre) {
//		return new Car(tyre); // Spring injects this dependency
//	}
}
