package costructor;

public class Constructor04Tir {
    int yil = 2000;
    String renk;
    String model;
    int km;
    boolean satilikMi;

    public Constructor04Tir(int i, String string, String string2, int j, boolean b) {
        this.km = i;
        this.model = string;
        this.renk = string2;
        this.yil = j;
        this.satilikMi = b;
    }

    public Constructor04Tir(int km, String model, String renk) {
        this.km = km;
        this.model = model;
        this.renk = renk;
    }
}
