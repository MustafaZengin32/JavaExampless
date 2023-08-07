package typecasting;

public class TypeCasting03ExpilicitNarrowing {
    public static void main(String[] args) {


    int sayi1 = 300;
    //int to short
    //bsilfdbc
    short sayi2 = (short) sayi1;

        System.out.println("sayi2 : " + sayi2);
    //short to byte
    byte sayi3 = (byte)sayi2;
        System.out.println("sayi3 : " + sayi3);
    double sayi4 = 87.9;
    //double to int
    int sayi5 = (int)sayi4;
        System.out.println("sayi5 : " + sayi5);
    int sayi6 = 27;
    int sayi7 = 4;
        System.out.println(sayi6 / sayi7);
    double sayi8 = 4.0;
    double sayi9 = 17.0;
        System.out.println((double)sayi6 / sayi8);
        System.out.println(sayi9 / (double)sayi7);
}
}
