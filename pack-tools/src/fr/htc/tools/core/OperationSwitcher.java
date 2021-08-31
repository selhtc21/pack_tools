package fr.htc.tools.core;

import fr.htc.tools.types.Addition;
import fr.htc.tools.types.Division;
import fr.htc.tools.types.EquationSecondDegree;
import fr.htc.tools.types.Factoriel;
import fr.htc.tools.types.Moyenne_EcartType;
import fr.htc.tools.types.Multiplication;
import fr.htc.tools.types.Operation;
import fr.htc.tools.types.PGCD;
import fr.htc.tools.types.Soustraction;
import fr.htc.tools.types.ValeurMax;
import fr.htc.tools.types.enums.OperationType;

public class OperationSwitcher {

	public static void switchTo(OperationType opType) {
		Operation op = null;
		switch (opType) {
		case ADDITION:
			op = new Addition();
			break;
		case SOUSTRACTION:
			op = new Soustraction();
			break;
		case PRODUIT:
			op = new Multiplication();
			break;
		case QOTIENT:
			op = new Division();
			break;
		case EQUATION_SECOND_DEGRE:
			op = new EquationSecondDegree();
			break;
		case FACTORIEL:
			op = new Factoriel();
			break;
		case PGCD:
			op = new PGCD();
			break;
		case MAX_TABLEAU:
			op = new ValeurMax();
			break;
		case MOYENNE_ECART_TYPE:
			op = new Moyenne_EcartType();
			break;
		case QUITTER:
			break;
		default:
			System.out.println("Valeur incorrect");
			return;
		}

		op.process(opType.getTitle());
	}

}
