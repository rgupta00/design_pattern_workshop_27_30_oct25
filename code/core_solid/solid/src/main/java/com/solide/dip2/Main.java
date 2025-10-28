package com.solide.dip2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car=(Car) ctx.getBean("car");
//		System.out.println(car.hashCode());
//		
//		System.out.println(car2.hashCode());
		
		car.move();
		
//		Tyre tyre=new MrfTyre();
//		Car car=new Car(tyre);
//		car.move();
	}
}
