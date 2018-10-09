package model;

import java.util.ArrayList;
import java.util.List;

public class Rodina {
	private Osoba otec;
	private Osoba matka;
	private List<Osoba> deti = new ArrayList<Osoba>();
	
	public List<Osoba> getDeti() {
		return deti;
	}
	public void setDeti(List<Osoba> deti) {
		this.deti = deti;
	}
	public Rodina(Osoba otec, Osoba matka) {
		this.otec = otec;
		this.matka = matka;
	}
	public Rodina() {
		
	}
	public Osoba getOtec() {
		return otec;
	}
	public void setOtec(Osoba otec) {
		this.otec = otec;
	}
	public Osoba getMatka() {
		return matka;
	}
	public void setMatka(Osoba matka) {
		this.matka = matka;
	}
}
