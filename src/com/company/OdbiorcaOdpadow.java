package com.company;

public class OdbiorcaOdpadow {
    private float CenaZaTone;
    private Wlasciciel Wlasciciel;

    public OdbiorcaOdpadow() {
        CenaZaTone = 1;
        Wlasciciel = new Wlasciciel();
    }

    public OdbiorcaOdpadow(float CenaZaTone, Wlasciciel Wlasciciel) {
        this.CenaZaTone = CenaZaTone;
        this.Wlasciciel = Wlasciciel;
    }

    public static void WywiezOdpady(ElektrowniaAtomowa elA) {
        elA.setIloscOdpadow(0f);
        System.out.println("\nOdpady zostaly wywiezione\n");
    }


    public float getCenaZaTone() { return CenaZaTone; }

    public void setCenaZaTone(float cenaZaTone) { CenaZaTone = cenaZaTone; }

    public Wlasciciel getWlasciciel() { return Wlasciciel; }

    public void setWlasciciel(Wlasciciel wlasciciel) { Wlasciciel = wlasciciel; }

    @Override
    public String toString() {
        return "\n\tCenaZaTone: " + CenaZaTone + "\t\tWlasciciel: " + Wlasciciel;
    }
}
