package fr.htc.tools.types.enums;

public enum OperationType {
	QUITTER(0, "Quitter"), ADDITION(1, "Addition"), SOUSTRACTION(2, "Soustraction"), PRODUIT(3, "Multiplcation"),
	QOTIENT(4, "Division"), EQUATION_SECOND_DEGRE(5, "Equation de second degre"), FACTORIEL(6, "Factoriel"),
	PGCD(7, "Plus grand commun diviseur"), MAX_TABLEAU(8, "grande valeur d'un tableau"),
	MOYENNE_ECART_TYPE(9, "moyenne_ecart type"), UNKNOWN(99, "Unknown");

	private int id;
	private String title;

	private OperationType(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public int IdOf() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public static OperationType valueOf(int id) {
		if (id < 0 || id > 9) {
			return OperationType.values()[10];
		}
		return OperationType.values()[id];
	}

}
