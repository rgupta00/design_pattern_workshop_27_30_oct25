package com.solid.pattern.ocp;

public class Main {

	public static void main(String[] args) {
		Shape shape=new PentaShape();
		ProcessShape.process(shape);
	}
}
