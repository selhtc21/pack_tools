package fr.htc.tools.types;

public class Factoriel implements Operation {

	@Override
	public void process(String title) {
		System.out.println("Je suis dans le choix : " + title);
		
	double n, result, i;
		
		System.out.println("Entrez une valeur pour n");
		n = scanner.nextInt();
		result = 1;
		i = n;

		while (i > 1) {
			result = result * i;
			i--;
		}

		System.out.println("La factorielle de n " + n + " vaut :" + result);
	}

}
