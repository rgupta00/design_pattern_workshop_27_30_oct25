package com.bankapp.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Magician magician=(Magician) applicationContext.getBean("m");
		System.out.println(magician.getClass());
		magician.doMagic();
		
		magician.doEat();
		
//		Magician magician=new MagicianProxy();
//		magician.doMagic();
	}
}
