package fr.htc.tools.types;

public class PGCD implements Operation {

	@Override
	public void process(String title) {
		
		/** 
		 * 
		 Renvoie de pgcd de deux entiers.
		   * @param a un entier 
		   * @param b l'autre entier */
		 
		System.out.println("Je suis dans le choix : " + title);
		   
		  /** Calcule et affiche le pgcd de deux entiers positifs lus au clavier. */
			
		   System.out.print("Donnez le premier entier : ");
			 int a = scanner.nextInt();
			
			System.out.print("Donnez le deuxieme entier  : ");
			 int b = scanner.nextInt();
			     
		        while ( a != b ) {
		        	
		  	if ( a < b )
		  	  b = b - a;
		  	else
		  	  a = a - b;
		        
		  	System.out.print("PGCD("+a+","+b+") = ");

		  	
		        System.out.println(a);
		      }
		  	
		System.out.println("le pgcd de a et b c'est :" +a );
			
	}
}
