package srl.neotech.corsojava;

public class Startup {

	public static void main(String[] args) {
		
	Alunno alunno1= new Alunno("Luca ", "Rossi", 25, "Blu");
    Alunno alunno2= new Alunno("Marco", "Verdi", 35, "Rosso");
    
    System.out.println(alunno1.nome+alunno2.colorePreferito);
    
	}

}
