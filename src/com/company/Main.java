package com.company;

public class Main {

    public static void main(String[] args) {

    Wlasciciel PolAtom = new Wlasciciel("PolAtom", "PL89898989", "Jarosław Kaczyński");
    Wlasciciel PolCoal = new Wlasciciel("PolCoal", "PL89723989", "Robert Lewandowski");
    Wlasciciel PolGaz = new Wlasciciel("PolGaz", "PL88127799", "Adam Małysz");
    Wlasciciel PolSun = new Wlasciciel("PolSun", "PL88127799", "Elon Musk");
    Wlasciciel Putin = new Wlasciciel("RosjaGurom", "RO12231232", "Wladimir Putin");
    Wlasciciel GPO = new Wlasciciel("GPO", "PL74892742", "Karol Podluzny");
    Wlasciciel UltraGaz = new Wlasciciel("ULtraGaz", "PL12312399", "Paweł Jumper");
    Wlasciciel MegaGaz = new Wlasciciel("MegaGaz", "PL32132199", "Alexy Miller");
    Wlasciciel NajtanszyOdbiorSmieci = new Wlasciciel("NajtanszyOdbiorSmieci", "PL83762346", "Karol Wiśnia");
    Wlasciciel Promyk = new Wlasciciel("Promyk", "PL46372837", "Kamil Glik");
    Wlasciciel Prund = new Wlasciciel("Elektryka prad nie tyka", "PL64839283", "Wojciech Szczesny");

    DystrybutorPradu Tauron= new DystrybutorPradu(123, Prund);

    DostawcaWegla Bogatynia = new DostawcaWegla(699.99f, Putin);
    DostawcaWegla Rosja = new DostawcaWegla(599.34f, GPO);

    DostawcaGazu Gazprom = new DostawcaGazu(0.99f, MegaGaz);
    DostawcaGazu PGNiG = new DostawcaGazu(1.11f, UltraGaz);

    OdbiorcaOdpadow Odbiorca1 = new OdbiorcaOdpadow(34.56f, NajtanszyOdbiorSmieci);
    OdbiorcaOdpadow Odbiorca2 = new OdbiorcaOdpadow(43.34f, Promyk);

	ElektrowniaAtomowa Czarnobyl = new ElektrowniaAtomowa("Czarnobyl",6969,42000,3, PolAtom, false, 86, 897, Tauron, 345, new OdbiorcaOdpadow[]{Odbiorca1, Odbiorca2});
    ElektrowniaGazowa Turow = new ElektrowniaGazowa("Turow",69,420,5, PolGaz, false, "gaz", 89f, 15, Tauron, 123f, Gazprom, 200f);
    ElektrowniaWeglowa Belchatow = new ElektrowniaWeglowa("Belchatow",100,690,15, PolCoal, false, "roksana wegiel", 109f, 25, Tauron, 103.5f, Rosja, 190f);
    ElektrowniaFotowoltaiczna Brudew = new ElektrowniaFotowoltaiczna("Brudzew", 200, 300, 1, PolSun, false, "10%", Tauron);



    System.out.println(Czarnobyl.toString());
    //System.out.println(Turow.toString());
    //System.out.println(Belchatow.toString());
    //System.out.println(Brudew.toString());
    Czarnobyl.RozpoczeciePracy();
    Czarnobyl.WywozOdpadow(1);
    System.out.println(Czarnobyl.toString());
    }
}
