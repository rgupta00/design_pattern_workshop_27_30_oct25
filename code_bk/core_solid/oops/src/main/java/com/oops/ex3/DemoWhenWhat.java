package com.oops.ex3;
interface Jumpable{
	void jump();
}
class Monkey implements Jumpable{
	void stayOnTree() {
		System.out.println("stay on tree");
	}

	void biteAnyBody() {
		System.out.println("biteAnyBody");
	}

	@Override
	public void jump() {
		System.out.println("monkey jump");
	}


}
//LSP?
class Kid implements Jumpable {
	void goingToSchool() {
		System.out.println("goingToSchool");
	}

	void play() {
		System.out.println("play");
	}

	@Override
	public void jump() {
		System.out.println("kid jump like monkey");
	}

}

public class DemoWhenWhat {

	public static void main(String[] args) {

	}
}
