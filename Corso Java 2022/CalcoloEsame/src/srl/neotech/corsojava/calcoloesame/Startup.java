package srl.neotech.corsojava.calcoloesame;

import java.util.ArrayList;
import java.util.Random;

public class Startup {

	public static void main(String[] args) {

	 ArrayList <Integer> prova = new ArrayList <Integer>();	

	 Random random = new Random();

	 Integer provaSritta = random.nextInt(-8,8);
	 prova.add(0, provaSritta);
	 System.out.println("Il voto della prova scritta è " +prova.get(0));

	 Integer provaOrale= random.nextInt(0,24);
	 prova.add(1, provaOrale);
	 System.out.println("Il voto della prova orale è " +prova.get(1));


	 Integer somma=prova.get(0) + prova.get(1);

	 System.out.println("Il voto totale delle due prove è " +somma);


	 if(prova.get(0)<=0 && somma>18)
		 System.out.println("Lo studente è stato bocciato");

	 else if(prova.get(0)<=0 && prova.get(1)<18) 
		 System.out.println("Lo studente è stato bocciato");
	 else if(prova.get(0)>0 && somma>18)
		 System.out.println("Lo studente è stato bocciato");

	 else if (somma==31||somma==32)
		 System.out.println("Il voto è maggiore di 30 quindi assegnata la lode");
	 else
		 System.out.println("Lo studente è stato promosso");
	}
}
