package com.kitri.test6;

public class TVProgram {
	String title;
	String broadcast;
	
	String director;
	String actor;
	String actress;
		
	public TVProgram() {
		this("�� �ܿ�, �ٶ��� �д�.", "SBS", "�����", "���μ�", "������");
	}
	public TVProgram(String title, String broadcast, String director) {
		this(title, broadcast, director,"","");
	}
	public TVProgram(String title, String broadcast, String director, String actor, String actress) {
		super();
		this.title = title;
		this.actor = actor;
		this.actress = actress;
		this.broadcast = broadcast;
		this.director = director;
	}
	
	@Override
	public String toString() {
		return title+" ("+broadcast+")"+"\n\t- ���� : "+director;
	}
	
	public String toString2() {
		return "\n\t- ���ڹ�� : "+actor+"\n\t- ���ڹ�� : "+actress;

	}
}
