package com.company;


public class DostawcaGazu {
	
	private float CenaZaM3;
	private Wlasciciel Wlasciciel;

	public DostawcaGazu() {
		CenaZaM3 = 1;
		Wlasciciel = new Wlasciciel();
	}
	
	public DostawcaGazu(float CenaZaM3, Wlasciciel Wlasciciel) {
		this.CenaZaM3 = CenaZaM3;
		this.Wlasciciel = Wlasciciel;
	}

	//---------------------------------------------------	
	
	public static void Dostawa(ElektrowniaGazowa e) {
		e.setIloscGazuWMagazynie(e.getMaxPojemnoscMagazynu());
	}
	
	
	
	//---------------------------------------------------
	
	public float getCenaZaM3() {
		return CenaZaM3;
	}

	public void setCenaZaM3(float cenaZaM3) {
		CenaZaM3 = cenaZaM3;
	}

	public Wlasciciel getWlasciciel() {
		return Wlasciciel;
	}

	public void setWlasciciel(Wlasciciel wlasciciel) {
		Wlasciciel = wlasciciel;
	}

	@Override
	public String toString() {
		return "\n\tCenaZaM3: " + CenaZaM3 + "\t\tWlasciciel: " + Wlasciciel;
	}
}
