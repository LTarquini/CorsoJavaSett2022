package srl.neotech.corsojava.aereoporto;

import java.util.ArrayList;
import java.util.List;

public class Aereoporto {

	private List<Aereo>aerei=new ArrayList <Aereo>();
	private List <Passeggero>passeggeri=new ArrayList <Passeggero>();
	private Integer raggioDiAzione;

	public List<Aereo> getAerei() {
		return aerei;
	}
	public void setAerei(List<Aereo> aerei) {
		this.aerei = aerei;
	}
	public List<Passeggero> getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(List<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}
	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}
	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}
	public Aereo atteraggio(Aereo a) {
		while(a.getDistanzaDallAeroporto()>0){
		System.out.println("L'aereo si sta avvcinando"+a.getIdUnivico());
		Integer distanzaAttuale=a.getDistanzaDallAeroporto()-a.getVelocita();
		a.setDistanzaDallAeroporto(distanzaAttuale);
		System.out.println("Blink");
		}

		System.out.println("Aereo"+a.getIdUnivico()+"l'aereo e' atterato");
		a.setStato(Stato.ATTERATO);

	return a;
	}
	public Aereo checkout(Aereo b) {

		System.out.println("checkout aereo"+b);
		for (int i=1;i<b.getModello().getCapienzaNumPasseggeri();i++){
		Passeggero passi= new Passeggero();

		passi.getMf();
		passi.getEta();

		System.out.println("Il passeggero è sbarcato"+b.getIdUnivico());
		}
	return b;
	}
	public Aereo  checkin(Aereo e,Passeggero c) {

	    System.out.println("checkin dell'aereo"+c);

		for (int i=1; i<e.getModello().getCapienzaNumPasseggeri();i++){
			if(c instanceof Excelsior) {	
				((Excelsior )c).setHaChampagne(true);
				System.out.println("Il passeggero ha a disposizione lo champagne");
				} else if(c instanceof Business){
				((Business )c).setHaGiornale(true);
			    System.out.println("Il passeggero ha a disposizione il giornale");}
				else if(c.getMf()=='F'){
			    c.setHasFiore(true);
			    System.out.println("Il passeggero donna ha avuto in regalo un fiore ");}
			System.out.println("Il passeggero"+c.getIdUnivoco()+" si è imbarcato");

			    System.out.println("Il numero di paesseggeri totali è"+c.getIdUnivoco());
        e.getPasseggeri().add(c);

        if(e.getPasseggeri().size()<e.getModello().getCapienzaNumPasseggeri())
        	break;
        }
	return e;
	}
	public Aereo decollo(Aereo d) {
		while(d.getDistanzaDallAeroporto()<d.getRaggioDiAzione()){
		Integer distanzaAttuale=d.getDistanzaDallAeroporto()+d.getVelocita();
		d.setDistanzaDallAeroporto(distanzaAttuale);
	    System.out.println("Blink");
			}

			System.out.println("Aereo"+d.getIdUnivico()+"è' fuori dallo spazio aereo");
			d.setStato(d.getStato().FUORI_SPAZIO_AEREO);
		return d;
	}
	}
