package com.solide.dip2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Tyre tyre;
	
	
	public Car(Tyre tyre) {
		this.tyre = tyre;
	}

	public void move() {
		tyre.rotate();
	}
}
