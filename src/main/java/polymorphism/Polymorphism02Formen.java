package polymorphism;

public class Polymorphism02Formen extends Polymorphism02Isci{

    public String sorumluOldBolum="bakim";
    public String isim="Emrullah";
    public static void main(String[] args) {

        // Inheritance'da data turu olarak class ismi kullanimi

        // Bir class'da obje uretirken data turu olarak class'in kendisini
        // veya parent(lar)ini kullanabiliriz.
        // Olusturdugumuz obje ile variable kullanmamiz gerekirse, hangi degeri
        // alacagini anlamak icin once Data turu olan class'a gideriz
        // orada aradigimiz variable varsa kullaniriz, yoksa
        // parent(lar)ina bakariz, yukari dogru giderken ilk buldugumuz degeri kullaniriz

        Polymorphism02Formen fr1=new Polymorphism02Formen();
        // fr1 objesini kullanarak hangi class'larin variable'lari gorebilirim
        fr1.sorumluOldBolum="Marangozhane";
        fr1.maas=10000;
        System.out.println(fr1.isim + " " + fr1.sorumluOldBolum+ " " + fr1.maas);
        // Emrullah Marangozhane 10000

        Polymorphism02Isci fr2=new Polymorphism02Formen();
        // Data turu olarak Isci secildigi icin
        fr2.bolum="Kaynak atolyesi";

        System.out.println(fr2.isim + " " + fr2.bolum+ " " + fr2.maas);
        // Mesut Kaynak atolyesi 5000


        Polymorphism02Personel fr3=new Polymorphism02Formen();
        System.out.println(fr3.isim); // Emre

    }
}
