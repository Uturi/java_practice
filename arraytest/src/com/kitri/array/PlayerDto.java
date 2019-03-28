package com.kitri.array;

//Dto : Data Transfer Object
//Vo : Value Object
//Bean
public class PlayerDto {
	
	private int number;
	private String name;
	private int position;
	private double grade;
	
	public PlayerDto(int number, String name, int position, double grade) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.grade = grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	String po[] = {"����Ÿ��", "����", "����", "1���", "2���", "3���", "���ݼ�", "���ͼ�", "�߰߼�", "���ͼ�"};
	
	

	@Override
	public String toString() {
		return "PlayerDto [���ȣ=" + number + ", \t������=" + name + ", \t������=" + po[position] + ", \t"+(position != 1? "Ÿ��=" : "�����=") + grade + "]";
	}	
	
	
}
