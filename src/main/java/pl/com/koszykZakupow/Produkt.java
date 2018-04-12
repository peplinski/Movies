package pl.com.koszykZakupow;

public class Produkt {
    private String nazwaProduktu;
    private double cenaProduktu; //netto
    private PodatekProduktu podatekProduktu;

    public Produkt(String nazwaProduktu, double cenaProduktu, PodatekProduktu podatekProduktu) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaProduktu = cenaProduktu;
        this.podatekProduktu = podatekProduktu;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public double getCenaProduktu() {
        return cenaProduktu;
    }

    public void setCenaProduktu(double cenaProduktu) {
        this.cenaProduktu = cenaProduktu;
    }

    public PodatekProduktu getPodatekProduktu() {
        return podatekProduktu;
    }

    public void setPodatekProduktu(PodatekProduktu podatekProduktu) {
        this.podatekProduktu = podatekProduktu;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cenaProduktu=" + cenaProduktu +
                ", podatekProduktu=" + podatekProduktu +
                '}';
    }

        public double podajCeneBrutto(double cenaNetto, PodatekProduktu podatekProduktu){
            double cenaBrutto = cenaNetto+(cenaNetto*podatekProduktu.getProcentPodatku())/100.0;
            return cenaBrutto;
        }

}
