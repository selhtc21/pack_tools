package fr.htc.tools.data;

public class Person {
	public String nom;
	public String prenom;
	public int age;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.println("Person");
		System.out.println("Nom    : " + this.nom);
		System.out.println("Prenom : " + this.prenom);
		System.out.println("Age    : " + this.age);
	}

	@Override
	public String toString() {
		return "Person [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

}
