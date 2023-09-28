package passbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {

        double fiyat=100;

        indirimUygula(fiyat); // method call
        System.out.println("method call sonrasi fiyat : " + fiyat);
    }

    public static void indirimUygula(double fiyat) {

        fiyat= fiyat* 0.90;

        System.out.println("%10 indirimli fiyat : " + fiyat); //90
        System.out.println(fiyat-10); // 80
    }
}
