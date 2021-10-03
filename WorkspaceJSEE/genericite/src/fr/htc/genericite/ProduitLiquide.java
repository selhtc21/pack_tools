package fr.htc.genericite;

public class ProduitLiquide extends Produit implements Cloneable{

	private int quantite;

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public ProduitLiquide(int quantite) {
		super();
		this.quantite = quantite;
	}


}
