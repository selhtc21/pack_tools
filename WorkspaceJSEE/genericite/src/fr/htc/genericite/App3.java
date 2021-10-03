package fr.htc.genericite;

public class App3 {

	public static void main(String[] args) {

Calcul<Integer> c = new Calcul<>();
System.out.println(c.comparer(5.9, 5));

Calcul<String> s = new Calcul<String>();
System.out.println(s.comparer("salwa", "salwa"));

Produit p1 = new Produit();
Produit p2 = new Produit();
System.out.println(c.comparer(p1, p2));
	}

}
