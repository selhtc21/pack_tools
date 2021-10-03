package fr.htc.genericite;

import java.io.Serializable;

//classe générique qui reçoit un type T qui hérite uniquement de la classe Produit

public class Traitement<T extends Produit& Serializable & Cloneable> {
	private T a ;
	private T b ;
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public T getB() {
		return b;
	}
	public void setB(T b) {
		this.b = b;
	}
	public Traitement(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Traitement() {
	} 
	
}
