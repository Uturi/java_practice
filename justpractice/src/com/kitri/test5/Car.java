package com.kitri.test5;

public class Car {
	String color;
	int account;
	Sonata sonata;
	String series;
	String use;
	
	public Car() {
		this("���",5000,"�¿�","NF");
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
		return "[����] "+color+"\t[�������] "+account+"\t[�뵵] "+use+"\t[�ø���] "+series;
	}
}
