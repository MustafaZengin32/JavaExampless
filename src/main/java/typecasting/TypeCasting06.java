package typecasting;

public class TypeCasting06 {
    public static void main(String[] args) {

        double sayi1 = 1000.14 ;

        int sayi2 = (int) sayi1;

        System.out.println("double degisken : " + sayi1); // 1000.14
        System.out.println("int degisken : " + sayi2); //1000

        // during explicit narrowing some data is lost

        byte sayi3 = (byte) sayi2;//64 128 256 512 1024// 1000/1024

        System.out.println("byte value : " + sayi3);  // -24



        int sayi4= 95;
        int sayi5=10;


        System.out.println("bolme sonucu : " + sayi4/sayi5);//both of them are int and result is int


        double sayi6= 2000;

        System.out.println(sayi6/sayi5); // 200.0 // one of them double and result is double


        double sayi7=5;

        System.out.println(sayi4/sayi7); // 19.0

    }

}
