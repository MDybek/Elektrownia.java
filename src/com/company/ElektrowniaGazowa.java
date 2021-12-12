package com.company;

import java.util.Arrays;

public class ElektrowniaGazowa extends ElektrowniaNaPaliwoStale {

	private float IloscGazuWMagazynie;
	private DostawcaGazu DostawcaGazu;
	private float MaxPojemnoscMagazynu;
	
	//Konstruktor przeciazony, wypisalem takie nazwy jak na schemacie
	public ElektrowniaGazowa(String Miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, Wlasciciel wlasciciel, boolean czyPracuje, String RodzajPaliwa, float ZuzyciePaliwa, int LiczbaBlokow, DystrybutorPradu Dystrubutor, float IloscGazuWMagazynie,  DostawcaGazu DostawcaGazu, float MaxPojemnoscMagazynu) {
		super(Miasto, MocChwilowa, MocMaksymalna, LiczbaPracownikow, wlasciciel, czyPracuje, RodzajPaliwa, ZuzyciePaliwa, LiczbaBlokow, Dystrubutor);

		this.IloscGazuWMagazynie = IloscGazuWMagazynie;
		this.DostawcaGazu = DostawcaGazu;
		this.MaxPojemnoscMagazynu = MaxPojemnoscMagazynu;
	}

		//Metody typu get i metody typu set


	public float getIloscGazuWMagazynie() { return IloscGazuWMagazynie; }

	public void setIloscGazuWMagazynie(float iloscGazuWMagazynie)  { IloscGazuWMagazynie = iloscGazuWMagazynie; }

	public DostawcaGazu getDostawcaGazu() {	return DostawcaGazu; }

	public void setDostawcaGazu(DostawcaGazu dostawcaGazu) { DostawcaGazu = dostawcaGazu; }

	public float getMaxPojemnoscMagazynu() {
		return MaxPojemnoscMagazynu;
	}

	public void setMaxPojemnoscMagazynu(float maxPojemnoscMagazynu) {
		MaxPojemnoscMagazynu = maxPojemnoscMagazynu;
	}

	@Override
	public String toString() {
		return "ElektrowniaGazowa:" + super.toString() +
				"\nIloscGazuWMagazynie: " + IloscGazuWMagazynie +
				"\nDostawcaGazu: " + DostawcaGazu.toString() +
				"\nMaksymalna pojemność magazynu: " + MaxPojemnoscMagazynu;
	}
}
