package pl.com.koszykZakupow;

public enum PodatekProduktu {
    VAT8(8),
    VAT23(23),
    VAT5(5),
    NO_VAT(0);
private int procentPodatku;
    PodatekProduktu(int podatek) {
     this.procentPodatku = podatek;
    }

    public int getProcentPodatku() {
        return procentPodatku;
    }
}
