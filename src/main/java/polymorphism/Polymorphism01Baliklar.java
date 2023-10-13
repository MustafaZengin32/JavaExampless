package polymorphism;

public class Polymorphism01Baliklar extends Polymorphism01Animals{

    public Polymorphism01Baliklar() {
    }

    public static void main(String[] args) {
        Polymorphism01Baliklar balik1 = new Polymorphism01Baliklar();
        balik1.beslenme();
        balik1.hareket();
        balik1.solunum();
    }

    public void hareket() {
        System.out.println("Baliklar yuzerek hareket eder");
    }

    public void solunum() {
        System.out.println("Baliklar solungaclariyla nefes alir");
    }
}

