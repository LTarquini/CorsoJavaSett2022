package srl.neotech.corsojava.gestionebiblioteca;

public class Associato extends Biblioteca {

	String nominativo;
	String stato;
	String listaDiLibriPresi;
	Integer idAssociato;

	public Integer getIdAssociato() {
		return idAssociato;
	}
	public void setIdAssociato(Integer idAssociato) {
		this.idAssociato=idAssociato;
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo=nominativo;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public String getListaDiLibriPresi() {
		return listaDiLibriPresi;
	}
	public void setListaDiLibriPresi(String listaDiLibriPresi) {
		this.listaDiLibriPresi=listaDiLibriPresi;
	}

	@Override
	public String toString() {
		return "Associato [idAssociato= "+idAssociato+ ", nominativo= "+nominativo+", stato=" + stato
				+ ", listaDiLibriPresi= "+listaDiLibriPresi+"]";
	}

}
