package srl.neotech.random;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd=new Random();
		
		for(int i=0;i<10;i++) {
		
		int numeroScelto=rnd.nextInt(11-1)+1;
		while(numeroScelto%3==0) {
		System.out.println("Numero "+numeroScelto);
		numeroScelto++;
	}
	}
}
}
