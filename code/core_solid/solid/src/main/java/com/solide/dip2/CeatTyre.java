package com.solide.dip2;


import org.springframework.stereotype.Component;
@Component
public class CeatTyre implements Tyre{
	public void rotate() {
		System.out.println("cret");
	}
}
