package srl.neotech.treno;

import org.springframework.stereotype.Component;

@Component
public class Motore {


	private String nomeMarca;
	private Integer potenza;
	
	public String getNomeMarca() {
		return nomeMarca;
	}
	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
	public Integer getPotenza() {
		return potenza;
	}
	public void setCilindrata(Integer potenza) {
		this.potenza = potenza;
	}
	public static Object getGt() {
		// TODO Auto-generated method stub
		return null;
	}
	}