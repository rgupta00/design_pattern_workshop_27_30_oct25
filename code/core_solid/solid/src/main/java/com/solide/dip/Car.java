package com.solide.dip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "car")
public class Car {
	
	private Tyre tyre;
	
	@Autowired
	public Car(Tyre tyre) {
		this.tyre = tyre;
	}

	public void move() {
		tyre.rotate();
	}
}
