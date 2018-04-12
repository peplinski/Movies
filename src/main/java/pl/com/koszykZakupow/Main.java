package pl.com.koszykZakupow;

public class Main {
    public static void main(String[] args) {
        Produkt jablko = new Produkt("jabłko",1.00,PodatekProduktu.VAT8);
        Produkt mleko = new Produkt("mleko",2.09,PodatekProduktu.VAT5);
        Produkt cocacola = new Produkt("cocacola",1.59,PodatekProduktu.VAT23);
        Produkt chleb = new Produkt("chleb",2.70,PodatekProduktu.VAT23);
        Produkt bulka = new Produkt("bulka",0.43,PodatekProduktu.VAT8);


    }
}
