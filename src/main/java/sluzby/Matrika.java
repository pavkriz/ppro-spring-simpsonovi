package sluzby;

import model.Osoba;
import model.Rodina;

public class Matrika implements Urad {

	@Override
	public String zkontroluj(Rodina r) {
		String zprava = "";
		if (r.getOtec() != null) {
			zprava = zprava + "otec: " + r.getOtec().getJmeno()
						+ " " + r.getOtec().getPrijmeni() + " ";
		}
		if (r.getMatka() != null) {
			zprava = zprava + "matka: " + r.getMatka().getJmeno()
						+ " " + r.getMatka().getPrijmeni() + " ";
		}
		if (r.getDeti().size() > 0) {
			zprava = zprava + "deti: ";
			for (Osoba o : r.getDeti()) {
				zprava = zprava + o.getJmeno() + " " + o.getPrijmeni() + ", ";
			}
		}
		return zprava;
	}

}
