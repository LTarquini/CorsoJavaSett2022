package srl.neotech.corso.allocazione;

public class Albero {
	
	public int eta;
	public int altezza;
	public int diametro;
	public boolean isFruttifero;

public void calcoloEtaTotale(){
	this.eta=6;
}
public void calcoloAltezzaTotale(){
	this.altezza=20;
}
public void calcoloDiametroTotale(){
	this.diametro=3;
}
	public boolean alberoDaFrutto() {
	
	if(this.altezza <3 && this.altezza >9) isFruttifero=false;
	if(this.altezza>=3 && this.altezza<=9) isFruttifero=true;
	return isFruttifero;
	{
}
}
}