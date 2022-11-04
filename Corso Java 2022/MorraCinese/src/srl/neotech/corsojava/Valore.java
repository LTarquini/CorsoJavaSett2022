package srl.neotech.corsojava;

public class Valore {

	private String nome;

	Valore(String nome){
           this.nome = nome;
	}
     public String toString() {       
	String stringa = this.nome; 
	return stringa;	
		}
	void vince(Valore valoreCheVince) {
	System.out.println(valoreCheVince.nome + " Vince su " + this.nome);
	
	
}
}