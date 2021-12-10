package com.company;
import java.util.Random;

public class Pracownicy {

    private  String Imie;
    private  String Nazwisko;
    private  float Doswiadczenie;

    public Pracownicy() {
        Imie = "Jan";
        Nazwisko = "Kowalski";
        Doswiadczenie = 1;
    }

    public Pracownicy(String Imie, String Nazwisko, float Doswiadczenie) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Doswiadczenie = Doswiadczenie;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public float getDoswiadczenie() {
        return Doswiadczenie;
    }

    public void setDoswiadczenie(float doswiadczenie) {
        Doswiadczenie = doswiadczenie;
    }

    @Override
    public String toString() {
        return "Imie: " + Imie + '\t' +
                "Nazwisko: " + Nazwisko + '\t' +
                "Doswiadczenie: " + Doswiadczenie + "\n";
    }
}
