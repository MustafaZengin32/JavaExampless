package encaptulations;

public class Encapsulation03A {
    public static void main(String[] args) {
        // Encapsulation02 class'indaki class member'a ulasmaya calisalim

        Encapsulation03 obj1 = new Encapsulation03();
        Encapsulation03 obj2 = new Encapsulation03();

        // Biz erisim yetkisini ikiye ayiriyoruz
        // 1- okuyabilme get()
        // 2- degistirip kullanabilme set()

        System.out.println(obj1.sayi); // 100 public oldugundan hem okudum
        obj1.sayi=25;				   // 25 hem de deger atayabildim
        System.out.println(obj1.sayi);//25

        System.out.println(obj2.sayi); // 100

        System.out.println(obj1.getOkulIsmi());//Maya Koleji  // get method'u oldugu icin sadece bilgi verir
        // obj1.getOkulIsmi()="Aydin Koleji"; // get method'u sadece okur, degistiremez

        obj1.setTcNo("326547895447");
        // System.out.println(obj1.setTcNo("12356478912")); set() methodu okumaya izin vermez
        System.out.println(obj1.getTcNo());//326547895447


        // Bir Class i�inde class member olu�turuken bunu di�er class'lar ile
        // ne oranda payla�aca��m�za karar veririz
        // 1-  Herkes okuyabilsin ve obje �zerinden de�er atay�p kullanbilsin ==> public
        // 2 - Herkes okuyabilsin ama kimse obje uzerinden de olsa de�i�tiremesin Private ==> Public get();
        // 3 - �lk atad���m de�eri kimse goremesin Private ==> Public set ()

    }

}
