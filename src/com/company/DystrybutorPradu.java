package com.company;

public class DystrybutorPradu {

    private float CenaSkupu;
    private Wlasciciel Wlasciciel;

    public DystrybutorPradu() {
        CenaSkupu = 1;
        Wlasciciel = new Wlasciciel();
    }

    public DystrybutorPradu(float CenaSkupu, Wlasciciel Wlasciciel) {
        this.CenaSkupu = CenaSkupu;
        this.Wlasciciel = Wlasciciel;
    }

    public static void KupPrad() { System.out.println("Prad kupiony"); }

    public float getCenaSkupu() { return CenaSkupu; }

    public void setCenaSkupu(float cenaSkupu) { CenaSkupu = cenaSkupu; }

    public com.company.Wlasciciel getWlasciciel() { return Wlasciciel; }

    public void setWlasciciel(com.company.Wlasciciel wlasciciel) { Wlasciciel = wlasciciel; }

    @Override
    public String toString() {
        return "\n\tCenaSkupu: " + CenaSkupu + "\t\tWlasciciel: " + Wlasciciel;
    }
}
