package inheritance;

public class Inheritance01Memur extends Inheritance01Personel {
    public int maas;

    public Inheritance01Memur() {
        super();
        System.out.println("Child class parametresiz constructor calisti");
    }

    public Inheritance01Memur(int maas) {
        super();
        System.out.println("Child class parametreli constructor calisti");
    }



    /*
     Inheritance'da constructor olusturdugumuzda java'nin otomatik olarak constructor'a
         koydugu super() keyword onemlidir.
     super() keyword default constructor gibidir. Biz gormesek de calisir, ancak yerine
         baska bir keyword yazarsak etkisiz hale gelir.
     *** extends varsa yerine birsey yazmadikca super() calisir..... ***
     */

    public static void main(String[] args) {

        Inheritance01Memur obj1=new Inheritance01Memur(2400);
        // public Inheritance01Memur(int maas) yukaridaki bu constructor a gitti
        //ilk olarak buradaki super den dolayi super class a gitti , daha sonra buradadaki parametresiz cons calisti yazdi
        //son olarak kendi memur sinifindaki constructor daki parametreli constructor u calisti


    }

}
