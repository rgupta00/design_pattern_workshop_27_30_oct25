package com.dp.behavioural.a.iterator_dp;

class Item {

	String name;
	float price;

	public Item(String name, float price) {
		this.name = name;
		this.price = price;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String toString() {
		return name + ": $" + price;
	}
}
