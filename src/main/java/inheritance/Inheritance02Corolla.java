package inheritance;

public class Inheritance02Corolla extends Inheritance02Toyota {

    String model= "Corolla";
    String uretimYeri="Turkiye";

    Inheritance02Corolla(){
        super();
        System.out.println("Corolla cons. calisti");
    }

    public static void main(String[] args) {

        Inheritance02Corolla corolla1= new Inheritance02Corolla();//obje olusturduk , parametresiz sirayla
                                                                  // contructorlari calistirdi
        /*
        Araba cons. calisti
        Toyota cons. calisti
        Corolla cons. calisti
         */
        System.out.println(corolla1.marka); // Toyota

        /*
          Bir child class'dan obje olusturdugumuzda
          olusturulan obje sadece child class'a ait ozellikleri degil
          tum parent class'l;arindaki ozellikleri de tasir.

          Bir objenin bir class'in ozelliklerini tasimasi icin
          o obje olusturulurken class'a ait constructor'in calismis olmasi gerekir
          Yani child class'indaki obje olusturulurken
          tum parent class'lardaki constructor'lar da otomatik olarak calisir

          java bu islem icin soyle bir mekanizma gelistirmistir.
          Bir class olusturdugumuzda biz constructor olusturmasak da
          Java'nin o class'a default constructor koydugu GIBI
          extends keyword kullanan bir class'da olusturulan her bir constructor'in
          ilk satirina biz gormesek de super() constructor call koyar.
         */

    }
}
