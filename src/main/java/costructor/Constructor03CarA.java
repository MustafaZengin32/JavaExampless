package costructor;

public class Constructor03CarA {
    int yil = 2000;
    String renk;
    String model;
    int km;
    boolean satilikMi;

    public Constructor03CarA(int km, String model, String renk, int yil, boolean satilikMi) {
    }

    public Constructor03CarA() {
    }

    public Constructor03CarA(int i) {
        this.km = i;
    }

    public Constructor03CarA(int i, int j) {
        this.yil = i;
        this.km = j;
    }

    public void hiz(int hiz) {
        System.out.println("araba saatte " + hiz + " km yapar");
    }

    public void yakit(String yakit) {
        System.out.println("Araba yakit olarak " + yakit + " kullanir");
    }
}
