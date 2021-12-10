package com.company;


import java.util.Arrays;

public class ElektrowniaFotowoltaiczna extends Elektrownia {

	private String ZuzyciePaneli;
	private Pracownicy[] pracownicy;
	private DystrybutorPradu Dystrybutor;
	
	//Konstruktor przeciazony, wypisalem takie nazwy jak na schemacie
	public ElektrowniaFotowoltaiczna(String Miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, Wlasciciel wlasciciel,
			boolean czyPracuje, String ZuzyciePaneli, DystrybutorPradu Dystrybutor)
	{
		
		super(Miasto, MocChwilowa, MocMaksymalna, LiczbaPracownikow, czyPracuje, wlasciciel);
		
		this.ZuzyciePaneli = ZuzyciePaneli;
		this.pracownicy = new Pracownicy[getLiczbaPracownikow()];
		this.Dystrybutor = Dystrybutor;
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

	public Pracownicy[] getPracownicy()
	{
		return pracownicy;
	}

	public void setPracownicy(Pracownicy[] pracownicy)
	{
		pracownicy = pracownicy;
	}

	public DystrybutorPradu getDystrybutor() 
	{
		return Dystrybutor;
	}

	public void setDystrybutor(DystrybutorPradu dystrybutor) 
	{
		Dystrybutor = dystrybutor;
	}

	//Metody klasy
	public void WymienPanele()
	{
		
		this.setZuzyciePaneli("0%");
	}

	@Override
	public String toString() {
		return "ElektrowniaFotowoltaiczna: " + super.toString() +
				"\nZuzyciePaneli: " + ZuzyciePaneli + '\'' +
				"\npracownicy: " + Arrays.toString(pracownicy) +
				"\nDystrybutor: " + Dystrybutor;
	}
}
