package methods;

public class Methods01 {

    public static void main(String[] args) {
        int sayi1 = 44;
        int sayi2 = 55;
        carpma(sayi1, sayi2);
        toplama(sayi1, sayi2);
        carpma(sayi1, sayi2);
    }

    public static void carpma(int sayi1, int sayi2) {

        System.out.println("sayilarin carpimi : " + sayi1 * sayi2);
    }

    public static void toplama(int sayi1, int sayi2) {

        System.out.println("sayilarin toplami : " + (sayi1 + sayi2));
    }
}
