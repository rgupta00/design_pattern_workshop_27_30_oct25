package com.solide.dip;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MrfTyre implements Tyre{

	public void rotate() {
		System.out.println("mrf");
	}
}
