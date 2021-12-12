package com.company;
import java.util.Arrays;

public class ElektrowniaAtomowa extends Elektrownia{

    private int LiczbaReaktorow;
    private float ZuzycieWody;
    private float IloscOdpadow;
    private OdbiorcaOdpadow[] OdbiorcaOdpadow;


    public ElektrowniaAtomowa(String miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, Wlasciciel wlasciciel, boolean czyPracuje, int LiczbaReaktorow, float ZuzycieWody, DystrybutorPradu Dystrybutor, float IloscOdpadow, OdbiorcaOdpadow[] OdbiorcaOdpadow){

        super(miasto, MocChwilowa, MocMaksymalna, LiczbaPracownikow, czyPracuje, wlasciciel, Dystrybutor);
        this.LiczbaReaktorow = LiczbaReaktorow;
        this.ZuzycieWody = ZuzycieWody;
        this.IloscOdpadow = IloscOdpadow;
        this.OdbiorcaOdpadow = OdbiorcaOdpadow;
    }

    public void ZwiekszMoc() {
        if(getMocChwilowa()<getMocMaksymalna()){
            setMocChwilowa(getMocChwilowa()+1);
            setZuzycieWody(getZuzycieWody()+10f);
        }
    }

    public void ZmniejszMoc() {
        if(getMocChwilowa()>0 && getZuzycieWody()>10){
            setMocChwilowa(getMocChwilowa()-1);
            setZuzycieWody(getZuzycieWody()-10f);
        }
    }

    public void WywozOdpadow(int x) {
        if (IloscOdpadow > 0)
            OdbiorcaOdpadow[x].WywiezOdpady(this);
    }


    //metody get i set
    public int getLiczbaReaktorow() {
        return LiczbaReaktorow;
    }

    public void setLiczbaReaktorow(int liczbaReaktorow) {
        LiczbaReaktorow = liczbaReaktorow;
    }

    public float getZuzycieWody() {
        return ZuzycieWody;
    }

    public void setZuzycieWody(float zuzycieWody) {
        ZuzycieWody = zuzycieWody;
    }


    public float getIloscOdpadow() {
        return IloscOdpadow;
    }

    public void setIloscOdpadow(float iloscOdpadow) {
        IloscOdpadow = iloscOdpadow;
    }

    public OdbiorcaOdpadow[] getOdbiorcaOdpadow() {
        return OdbiorcaOdpadow;
    }

    public void setOdbiorcaOdpadow(OdbiorcaOdpadow odbiorcaOdpadow, int x) {
        OdbiorcaOdpadow[x] = odbiorcaOdpadow;
    }

    @Override
    public String toString() {
        return "ElektrowniaAtomowa:" + super.toString() +
                "\nLiczbaReaktorow: " + LiczbaReaktorow +
                "\nZuzycieWody: " + ZuzycieWody +
                "\nIloscOdpadow: " + IloscOdpadow +
                "\nOdbiorcaOdpadow: " + Arrays.toString(OdbiorcaOdpadow);
    }

}
