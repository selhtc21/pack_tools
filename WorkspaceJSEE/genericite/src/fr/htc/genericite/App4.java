package fr.htc.genericite;

public class App4 {

	public static void main(String[] args) {

		Traitement<ProduitLiquide> t = 
				new Traitement<>(new ProduitLiquide(0),new ProduitLiquide(0));
		System.out.println(t.getA().getQuantite());
		System.out.println(t.getB().getQuantite());
	}

}
