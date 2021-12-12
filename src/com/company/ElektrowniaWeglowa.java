package com.company;

import java.util.Arrays;

public class ElektrowniaWeglowa extends ElektrowniaNaPaliwoStale {

    private DystrybutorPradu DystrybutorPradu;
    private Pracownicy[] Pracownicy;
    private DostawcaWegla DostawcaWegla;
    private float IloscWeglaWMagazynie;
    private float MaxPojemnoscMagazynu;
/*
    public ElektrowniaWeglowa() {
        DostawcaWegla = new DostawcaWegla();
        DystrybutorPradu = new DystrybutorPradu();
        IloscWeglaWMagazynie = 100;
        Pracownicy = new Pracownicy[this.getLiczbaPracownikow()];

    }*/

    public ElektrowniaWeglowa(String Miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, Wlasciciel wlasciciel, boolean czyPracuje, String RodzajPaliwa, float ZuzyciePaliwa, int LiczbaBlokow, DystrybutorPradu DystrybutorPradu, float IloscWeglaWMagazynie, DostawcaWegla DostawcaWegla, float MaxPojemnoscMagazynu) {

        super(Miasto, MocChwilowa, MocMaksymalna, LiczbaPracownikow, wlasciciel, czyPracuje, RodzajPaliwa, ZuzyciePaliwa, LiczbaBlokow, DystrybutorPradu);
        this.DostawcaWegla = DostawcaWegla;
        this.IloscWeglaWMagazynie = IloscWeglaWMagazynie;
        this.MaxPojemnoscMagazynu = MaxPojemnoscMagazynu;
    }

    public DystrybutorPradu getDystrybutorPradu() {
        return DystrybutorPradu;
    }

    public void setDystrybutorPradu(DystrybutorPradu dystrybutorPradu) {
        DystrybutorPradu = dystrybutorPradu;
    }

    public Pracownicy[] getPracownicy() {
        return Pracownicy;
    }

    public void setPracownicy(Pracownicy[] pracownicy) {
        Pracownicy = pracownicy;
    }

    public DostawcaWegla getDostawcaWegla() {
        return DostawcaWegla;
    }

    public void setDostawcaWegla(DostawcaWegla dostawcaWegla) {
        DostawcaWegla = dostawcaWegla;
    }

    public float getIloscWeglaWMagazynie() {
        return IloscWeglaWMagazynie;
    }

    public void setIloscWeglaWMagazynie(float iloscWeglaWMagazynie) {
        IloscWeglaWMagazynie = iloscWeglaWMagazynie;
    }

    public float getMaxPojemnoscMagazynu() {
        return MaxPojemnoscMagazynu;
    }

    public void setMaxPojemnoscMagazynu(float maxPojemnoscMagazynu) {
        MaxPojemnoscMagazynu = maxPojemnoscMagazynu;
    }

    @Override
    public String toString() {
        return "ElektrowniaWeglowa: " + super.toString() +
                "\nDystrybutorPradu: " + DystrybutorPradu.toString() +
                "\nPracownicy: " + Arrays.toString(Pracownicy) +
                "\nDostawcaWegla: " + DostawcaWegla.toString() +
                "\nIloscWeglaWMagazynie: " + IloscWeglaWMagazynie +
                "\nMaksymalna Pojemność Magazynu: " + MaxPojemnoscMagazynu;
    }
}
