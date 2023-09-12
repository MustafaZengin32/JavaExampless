package methods;

public class Methods03Overloading {
    public static void main(String[] args) {

        topla(2, 4);
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("dort sayinin toplami : " + (sayi1 + sayi2 + sayi3 + sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("uc sayinin toplami : " + (sayi1 + sayi2 + sayi3));
    }

    private static void topla(int sayi1, double sayi2) {
        System.out.println("iki sayinin toplami id: " + ((double)sayi1 + sayi2));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("iki sayinin toplami ii: " + (sayi1 + sayi2));
    }

    private static void topla(double sayi1, int sayi2) {
        System.out.println("iki sayinin toplami di: " + (sayi1 + (double)sayi2));
    }

    private static void topla(double sayi1, double sayi2) {
        System.out.println("iki sayinin toplami dd: " + (sayi1 + sayi2));
    }
}
