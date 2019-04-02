package com.kitri.test6;

public class TVProgram {
	String title;
	String broadcast;
	
	String director;
	String actor;
	String actress;
		
	public TVProgram() {
		this("그 겨울, 바람이 분다.", "SBS", "김규태", "조인성", "송혜교");
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
		return title+" ("+broadcast+")"+"\n\t- 감독 : "+director;
	}
	
	public String toString2() {
		return "\n\t- 남자배우 : "+actor+"\n\t- 여자배우 : "+actress;

	}
}
