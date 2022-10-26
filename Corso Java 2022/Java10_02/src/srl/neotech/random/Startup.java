package srl.neotech.random;

import java.util.ArrayList;
import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd=new Random();
		
		ArrayList<String> numeriCasuali=new ArrayList<String>();
		
		for(int i=0;i<10;i++) {
		int numeroScelto=rnd.nextInt(11-1)+1;
		if(numeroScelto==1) System.out.println("Numero 1");
		if(numeroScelto==2) System.out.println("Numero 2");
		if(numeroScelto==3) System.out.println("Numero 3");
		if(numeroScelto==4) System.out.println("Numero 4");
		if(numeroScelto==5) System.out.println("Numero 5");
		if(numeroScelto==6) System.out.println("Numero 6");
		if(numeroScelto==7) System.out.println("Numero 7");
		if(numeroScelto==8) System.out.println("Numero 8");
		if(numeroScelto==9) System.out.println("Numero 9");
		if(numeroScelto==10) System.out.println("Numero 10");
	

	}
	}
}
