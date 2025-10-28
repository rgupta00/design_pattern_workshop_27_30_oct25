package com.bankapp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Tyre tyre=(Tyre) applicationContext.getBean("getTyre");
//		System.out.println(tyre.hashCode());
//		
//		
//		Tyre tyre2=(Tyre) applicationContext.getBean("getTyre");
//		System.out.println(tyre2.hashCode());
		
		Car car=(Car) applicationContext.getBean("car");
		System.out.println(car.hashCode());
		System.out.println(car.getTyre().hashCode());
		
		Car car2=(Car) applicationContext.getBean("car");
		System.out.println(car2.hashCode());
		System.out.println(car2.getTyre().hashCode());
		
		
	}
}
