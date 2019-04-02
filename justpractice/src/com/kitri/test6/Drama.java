package com.kitri.test6;

import java.util.ArrayList;
import java.util.List;

public class Drama extends TVProgram {
	
	public Drama() {
		super();
	}
	
	public Drama(String title, String broadcast, String director) {
		super(title,broadcast,director);
	}
	
	public Drama(String title, String broadcast, String director, String actor, String actress) {
		super(title,broadcast,director,actor,actress);
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public String toString2() {
		return super.toString2();
	}
	
}
