package fr.htc.tools.data;

public class Person {
	public String nom;
	public String prenom;
	public int age;
	
	public void print() {
		System.out.println("Person");
		System.out.println("Nom    : " + this.nom);
		System.out.println("Prenom : " + this.prenom);
		System.out.println("Age    : " + this.age);
	}
}
