package com.company;

public abstract class Elektrownia {

	private String miasto;
	private int MocChwilowa;
	private int MocMaksymalna;
	private int LiczbaPracownikow;
	private Wlasciciel wlasciciel;
	private boolean czyPracuje;
	
	public Elektrownia()
	{
		miasto = "";
		MocChwilowa = 0;
		MocMaksymalna = 0;
		LiczbaPracownikow = 0;
		wlasciciel = new Wlasciciel();
		czyPracuje = false;
	}
	
	public Elektrownia(String miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, boolean czyPracuje, Wlasciciel wlasciciel)
	{
		this.miasto = miasto;
		this.MocChwilowa = MocChwilowa;
		this.MocMaksymalna = MocMaksymalna;
		this.LiczbaPracownikow = LiczbaPracownikow;
		this.wlasciciel = wlasciciel;
		this.czyPracuje = czyPracuje;
	}

	
	public Wlasciciel getWlasciciel(){
		return wlasciciel;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public int getMocChwilowa() {
		return MocChwilowa;
	}

	public void setMocChwilowa(int mocChwilowa) {
		MocChwilowa = mocChwilowa;
	}

	public int getMocMaksymalna() {
		return MocMaksymalna;
	}

	public void setMocMaksymalna(int mocMaksymalna) {
		MocMaksymalna = mocMaksymalna;
	}

	public int getLiczbaPracownikow() {
		return LiczbaPracownikow;
	}

	public void setLiczbaPracownikow(int liczbaPracownikow) {
		LiczbaPracownikow = liczbaPracownikow;
	}

	public boolean isCzyPracuje() {
		return czyPracuje;
	}

	public void setCzyPracuje(boolean czyPracuje) {
		this.czyPracuje = czyPracuje;
	}
	
	public String toString()
	{
		 return "\nMiasto: " + miasto + "\nmoc chwilowa: " + MocChwilowa + "\nmoc maksymalna: " + MocMaksymalna + "\nliczba pracownikow: " + LiczbaPracownikow + "\nczy pracuje: " + czyPracuje + " \nwlasciciel elektrowni:\t\t" + wlasciciel;
	}
	
	public void RozpoczeciePracy(){
		if(czyPracuje) {
			System.out.println("\nElektrownia już pracuje\n");
		}else {
			System.out.println("\nElektrownia zaczyna pracowac\n");
			this.setCzyPracuje(true);

		}
	}
	
	public void ZatrzymaniePracy(){
		if(czyPracuje) {
			System.out.println("\nElektrownia kończy prace\n");
			this.setCzyPracuje(false);
		}else {
			System.out.println("\nElektrownia zaczyna pracowac\n");


		}
	}

}
