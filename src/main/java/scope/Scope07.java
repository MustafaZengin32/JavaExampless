package scope;

public class Scope07 {

    static String hastaneismi="Yildiz hastanesi";
    static int hastaSayisi= 23453;
    static String basHekimIsmi;
    String persIsmi="Isim girilmedi";
    String persTelefonu="Telefon girilmedi";
    int persYasi;

    /*
      Class level variable'larin scope'u tum class'dir
      static kelimesi ile isaretlenen variable'lara
      class icerisinde heryerden ulasilabildigi icin diger adi class variables'dir.

      static kelimesi ile isaretlenmeyen variable'lara ise instance variable denir.
      instance variable'lar objelere bagli olduklarindan
      bu variable'larin diger adi object variables'dir.

     */

    /*
    Java Runtime programdir
    calismaya basladiginda variable'lara atanan degerleri isler
    calistigi muddetce yapilan degisikleri kaydeder
    ama calismasi bittiginde degisen degerler reset'lenir

    */

    // kod takibi main method'dan baslar
    // main method'un sonuna gelindiginde hersey biter
    // tum degisimler resetlenir
    // variable degerleri bastaki hallerine doner

    // C03 class'indaki instance variable'lara nasil ulasabiliriz ?
    // instance variable'larin diger adi obje variable'laridir
    // instance variable'lara obje uzerinden ulasabiliriz


    public static void main(String[] args) {



    }

}
