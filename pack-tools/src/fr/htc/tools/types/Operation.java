package fr.htc.tools.types;

import java.util.Scanner;

public interface Operation {
	static Scanner scanner = new Scanner(System.in); 
	
	public void process(String title);

}
