package com.bankapp.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MrfTyre implements Tyre{

	@Override
	public void rotate() {
		System.out.println("mrf tyre");
	}

}
