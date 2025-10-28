package com.bankapp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Car {

	@Autowired
	private Tyre tyre;

	@Lookup
	Tyre getTyre() {
		return null;
	}

	public void move() {
		tyre.rotate();
	}
}
//@Component
//@Scope("singleton")
//public class Car {
//
//	private Tyre tyre;
//
//	@Autowired
//	private ApplicationContext applicationContext;
//	
//
//	Tyre getTyre() {
//		return (Tyre) applicationContext.getBean("mrfTyre");
//	}
//
//	public void move() {
//		tyre.rotate();
//	}
//}
