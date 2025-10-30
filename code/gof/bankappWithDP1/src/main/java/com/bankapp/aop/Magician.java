package com.bankapp.aop;

import org.springframework.stereotype.Component;

//Cross cutting concern
@Component(value = "m")
 public class Magician {
	
	public void doMagic() {
		System.out.println("abara ka dabra...");

	}
	public void doEat() {
		System.out.println("eating food...");
	}
}
