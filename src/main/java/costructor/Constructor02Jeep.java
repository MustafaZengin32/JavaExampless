package costructor;

public class Constructor02Jeep {

    int ilanNo = 1001;
    String marka;
    String model;
    int yil = 2001;
    int fiyat = 10000;


    public Constructor02Jeep() {
    }

    public void hiz(int hiz) {
        System.out.println("araba saatte " + hiz + " km yapar");
    }

    public void yakit(String yakit) {
        System.out.println("Araba yakit olarak " + yakit + " kullanir");
    }
}
