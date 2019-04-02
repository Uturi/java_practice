package com.kitri.test5;

public class Car {
	String color;
	int account;
	Sonata sonata;
	String series;
	String use;
	
	public Car() {
		this("흰색",5000,"승용","NF");
	}
	public Car(String color, int account, String use, String series) {
		super();
		this.account = account;
		this.color = color;
		this.use = use;
		this.series = series;
	}
	

	@Override
	public String toString() {
		return "[색상] "+color+"\t[생산수량] "+account+"\t[용도] "+use+"\t[시리즈] "+series;
	}
}
