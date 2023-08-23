
package scope;

public class Scope03 {
    // static variable'lar class level'da olusturuldugu icin class'in her yerinden kullanilabilirler

    // instance variable'lar static olmayan method'larda direk kullanilabiliyorken, static method'larda
    // object olusturularak kullanilabiliyordu

    // static variable'lar ise ister static isterse static olamayan tum method'lardan direk kullanilabilir

    // Static variable'lar icin object olusturma ihtiyaci yoktur

    // Baska bir Class'dan static variable'lara ulasmak istedigimizde
    // Ulasmak istedigimiz Class'in adi . static variable adi yazmamiz yeterlidir.





    static int okulId= 1201;
    static String okulAdi="Yildiz Koleji";
    static boolean acikMi;

    int kantingelir=100;


    public static void main(String[] args) {

        //System.out.println(kantingelir); gormez

        System.out.println(okulId);

        System.out.println(okulId + " " + okulAdi + " " + acikMi);
        okulId=1202;
        acikMi=true;

        staticMethod();

        System.out.println(okulId + " " + okulAdi + " " + acikMi); //
    }

    public static void staticMethod() {

        //System.out.println(kantingelir);static olmayan method da gordu ama burada gormedi

        Scope03 scope = new Scope03();
        System.out.println(scope.kantingelir);// ancak obje olustrursan gorursun

        System.out.println(okulId + " " + okulAdi + " " + acikMi); // 1202 Yildiz Koleji true
        okulId=1203;
    }


    public void method() {
        System.out.println(kantingelir);

        okulId=1205;
    }


}
