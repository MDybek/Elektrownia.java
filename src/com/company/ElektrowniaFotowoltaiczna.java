package com.company;


import java.util.Arrays;

public class ElektrowniaFotowoltaiczna extends Elektrownia {

	private String ZuzyciePaneli;
	
	//Konstruktor przeciazony, wypisalem takie nazwy jak na schemacie
	public ElektrowniaFotowoltaiczna(String Miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, Wlasciciel wlasciciel,
			boolean czyPracuje, String ZuzyciePaneli, DystrybutorPradu Dystrybutor)
	{
		
		super(Miasto, MocChwilowa, MocMaksymalna, LiczbaPracownikow, czyPracuje, wlasciciel, Dystrybutor);
		
		this.ZuzyciePaneli = ZuzyciePaneli;
	}
	
	//Metody typu get i metody typu set
	public String getZuzyciePaneli() 
	{
		return ZuzyciePaneli;
	}

	public void setZuzyciePaneli(String zuzyciePaneli) 
	{
		ZuzyciePaneli = zuzyciePaneli;
	}

	//Metody klasy
	public void WymienPanele()
	{
		
		this.setZuzyciePaneli("0%");
	}

	@Override
	public String toString() {
		return "ElektrowniaFotowoltaiczna: " + super.toString() +
				"\nZuzyciePaneli: " + ZuzyciePaneli + '\'';
	}
}
