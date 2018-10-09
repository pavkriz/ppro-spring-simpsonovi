package model;

public class Osoba {
	private String jmeno;
	private String prijmeni;
	private int plat;
	public Osoba(String jmeno, String prijmeni, int plat) {
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.plat = plat;
	}
	public Osoba() {
		
	}
	public String getJmeno() {
		return jmeno;
	}
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}
	public String getPrijmeni() {
		return prijmeni;
	}
	public void setPrijmeni(String prijmeni) {
		this.prijmeni = prijmeni;
	}
	public int getPlat() {
		return plat;
	}
	public void setPlat(int plat) {
		this.plat = plat;
	}
	@Override
	public String toString() {
		return "Osoba [jmeno=" + jmeno + ", prijmeni=" + prijmeni + ", plat="
				+ plat + "]";
	}	
	
}
