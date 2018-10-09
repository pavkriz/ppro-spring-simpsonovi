package sluzby;

import model.Rodina;

public class FinancniUrad implements Urad {

	@Override
	public String zkontroluj(Rodina r) {
		//int soucet = r.getOtec().getPlat() + r.getMatka().getPlat();
		int soucet = 0;
		if (r.getOtec() != null) {
			soucet += r.getOtec().getPlat();
		}
		if (r.getMatka() != null) {
			soucet += r.getMatka().getPlat();
		}
		if (r.getDeti().size() > 0) {
			double prumer = (double)soucet / r.getDeti().size();
			return "Celkovy prijem rodicu je " + soucet 
						+ " a prumerny prijem na dite je " + prumer;
		} else {
			return "Celkovy prijem rodicu je " + soucet;
		}
	}

}
