package polymorphism;

public class Polymorphism01KumesHayvanlari extends Polymorphism01Kuslar{

    public Polymorphism01KumesHayvanlari() {
    }

    public static void main(String[] args) {
        Polymorphism01KumesHayvanlari kms1 = new Polymorphism01KumesHayvanlari();
        kms1.beslenme();
        kms1.hareket();
        kms1.solunum();

        Polymorphism01Kuslar kms2 = new Polymorphism01KumesHayvanlari();
        kms2.beslenme();
        kms2.hareket();
        kms2.solunum();

        Polymorphism01Kuslar kms3 = new Polymorphism01Kuslar();
        kms3.beslenme();
        kms3.hareket();
        kms3.solunum();

        Polymorphism01Animals kms4 = new Polymorphism01KumesHayvanlari();
        kms4.beslenme();
        kms4.hareket();
        kms4.solunum();
    }

    public void hareket() {
        System.out.println("Kumes hayvanlari yuruyerek hareket eder");
    }
}
