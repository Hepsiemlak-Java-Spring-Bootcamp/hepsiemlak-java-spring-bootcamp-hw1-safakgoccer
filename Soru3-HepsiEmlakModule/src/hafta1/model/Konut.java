package hafta1.model;

public class Konut extends Ilan{

    String il = "İstanbul";
    String ilce = "Kağıthane";
    String konutTipi = "Daire";
    String odaSayisi = "3+1";
    int alan = 145;
    int bulunduguKat = 3;





    public Konut(String il, String ilce, String konutTipi, String odaSayisi, int alan, int bulunduguKat) {
        this.il = il;
        this.ilce = ilce;
        this.konutTipi = konutTipi;
        this.odaSayisi = odaSayisi;
        this.alan = alan;
        this.bulunduguKat = bulunduguKat;
    }
}
