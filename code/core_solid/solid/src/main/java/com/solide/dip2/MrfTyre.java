package com.solide.dip2;

import org.springframework.stereotype.Component;

@Component
public class MrfTyre implements Tyre{

	public void rotate() {
		System.out.println("mrf");
	}
}
