package srl.neotech.aereoporto;

import java.util.ArrayList;

public class Aereoporto {

	private Integer raggioDiazione;
	private Pista pista;

	ArrayList <Passeggero> listaPasseggeri = new ArrayList<Passeggero>();
	ArrayList <Aereo> listaAerei = new ArrayList<Aereo>();

	public Aereo atterraggio( Aereo aereoInVolo) {


		Integer kmPercorsi = 0;
		while (aereoInVolo.getDistanzaAereoporto()<=0) {
			Integer velocita = aereoInVolo.getVelocita();
			Integer distanza = aereoInVolo.getDistanzaAereoporto();
			kmPercorsi = kmPercorsi + velocita;
			Integer rimanenza = aereoInVolo.getDistanzaAereoporto()-kmPercorsi;
			System.out.println(kmPercorsi);
		}
		aereoInVolo.setStato(Stato.ATTERRATO);

		return aereoInVolo;
	}
	public Passeggero checkOut(Passeggero passeggeroDaSbarcare) {

		Passeggero passeggeroSbarcato = passeggeroDaSbarcare;

		return passeggeroSbarcato;
	}

	public Aereo decollo (Aereo aereoATerra) {

		aereoATerra.setStato(Stato.DECOLLATO);

		return aereoATerra;

	}

	public Passeggero checkIn (Aereo inPartenza, Passeggero passeggeroDaImbarcare ) {

		Passeggero passeggeroImbarcato = passeggeroDaImbarcare;
		if (passeggeroImbarcato.getClassePasseggero().getExcelsior() == passeggeroImbarcato.getClassePasseggero().getExcelsior()) {
			passeggeroImbarcato.getClassePasseggero().getExcelsior().setHasChampagne(true);
		} else if (passeggeroImbarcato.getClassePasseggero().getBusiness() == passeggeroImbarcato.getClassePasseggero().getBusiness()) {
			passeggeroImbarcato.getClassePasseggero().getBusiness().setHasGiornale(true);
		} else if (passeggeroImbarcato.getClassePasseggero().getTurista() == passeggeroImbarcato.getClassePasseggero().getTurista()) {
			passeggeroImbarcato.getClassePasseggero().getTurista().setHasAnimale(true);
		}

		return passeggeroImbarcato;
	}
    public Integer getRaggioDiazione() {
		return raggioDiazione;
	}
	public void setRaggioDiazione(Integer raggioDiazione) {
		this.raggioDiazione = raggioDiazione;
	}
	public Pista getPista() {
		return pista;
	}
	public void setPista(Pista pista) {
		this.pista = pista;
	}
	public ArrayList<Passeggero> getListaPasseggeri() {
		return listaPasseggeri;
	}
	public void setListaPasseggeri(ArrayList<Passeggero> listaPasseggeri) {
		this.listaPasseggeri = listaPasseggeri;
	}
	public ArrayList<Aereo> getListaAerei() {
		return listaAerei;
	}
	public void setListaAerei(ArrayList<Aereo> listaAerei) {
		this.listaAerei = listaAerei;
	}
}
