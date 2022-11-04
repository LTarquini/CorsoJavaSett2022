package srl.neotech.corso.allocazione;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Albero alberoNumeroUno=new Albero();
		alberoNumeroUno.eta=67;
		alberoNumeroUno.calcoloEtaTotale();
		System.out.println("L'albero numero uno ha:"+alberoNumeroUno.eta +" anni");
		
		alberoNumeroUno.altezza=21;
		alberoNumeroUno.calcoloAltezzaTotale();
		System.out.println("L'albero numero uno è alto:"+alberoNumeroUno.altezza +" metri");
		
		alberoNumeroUno.diametro=3;
		alberoNumeroUno.calcoloDiametroTotale();
		System.out.println("L'albero numero uno ha:"+alberoNumeroUno.diametro +" metri di diametro");
		
	}
}
      