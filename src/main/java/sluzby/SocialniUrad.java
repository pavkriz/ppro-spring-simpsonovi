package sluzby;

import model.Rodina;

public class SocialniUrad implements Urad {

	@Override
	public String zkontroluj(Rodina r) {
		if (r.getOtec() == null || r.getMatka() == null) {
			return "Rodina je neuplna";
		} else {
			return "Rodina je uplna";
		}
	}

}
