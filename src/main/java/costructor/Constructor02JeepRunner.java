package costructor;

public class Constructor02JeepRunner {
    public static void main(String[] args) {
        Constructor02Jeep jeep1 = new Constructor02Jeep();
        System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " + jeep1.model + " " + jeep1.yil);
        // 10000 1001 null null 2001

        jeep1.fiyat = 15000;
        jeep1.ilanNo = 1002;
        jeep1.marka = "Toyota";
        jeep1.model = "Corolla";
        jeep1.yil = 2005;
        System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " + jeep1.model + " " + jeep1.yil);
        //15000 1002 Toyota Corolla 2005

        jeep1.hiz(150);
        jeep1.yakit("benzin");
    }
}
