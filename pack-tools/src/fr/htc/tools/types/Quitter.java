package fr.htc.tools.types;

public class Quitter implements Operation {

	@Override
	public void process(String title) {
		System.out.println("Good bye... !!!");
	}
}
