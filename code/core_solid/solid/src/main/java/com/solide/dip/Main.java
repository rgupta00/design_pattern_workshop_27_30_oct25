package com.solide.dip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		Car car=(Car) ctx.getBean("car");
		car.move();
		
//		Tyre tyre=new MrfTyre();
//		Car car=new Car(tyre);
//		car.move();
	}
}
