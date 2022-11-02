package srl.neotech.corsojava.java22;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		Cantina cantina = new Cantina();

		for(int i=1; i<=100; i++){

		Cisterna cisterna = new Cisterna();

		int num = random.nextInt(3-1)+1;
		if(num==1) cisterna.setTipo("alluminio");
		else if(num==2) cisterna.setTipo("rame");
		else if(num==3) cisterna.setTipo("acciaio");

		int numQt = random.nextInt(1000-0)+0;
		cisterna.setQuantita(numQt);
		int numEv = random.nextInt(100-0)+0;
		cisterna.setEvapPerDay(numEv);
		int numGas = random.nextInt(100-0)+0;
		cisterna.setLivelloGas(numGas);
		cantina.getCisterne().add(cisterna);

		System.out.println("Cantina numero " + i);

		}
    }
}