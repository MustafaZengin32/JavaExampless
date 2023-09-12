package methods;

import java.util.Scanner;

public class Method04 {

    /*
		 Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		 Kullanici 2,3 veya 4 degerini girerse,
		 kullanicidan bu sayilari girmesini isteyin
		 ve sayilarin toplamini yazdirin.
		 Kullanici toplamak istedigi sayi adedini 4�den buyuk girerse
		 �Cok sayi girdiniz, ben toplayamam� yazdirin.
		 2'den kucuk bir sayi girerse "En az 2 sayi girmelisiniz"
		 */
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("How much number do you want to sum(2,3,4 or more");
        int kacsayi=scanner.nextInt();

         if(kacsayi<2){
            System.out.println("please enter min. 2 number");
        }

        else if (kacsayi==2){
            ikisayitoplama();

        }
        else if (kacsayi==3){
            ucsayitoplama();

        }
        else if (kacsayi==4){

           dortsayitoplama();

        }
        else {
            System.out.println("i can not do it");
        }
}

    public static void ikisayitoplama(){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter 2 number");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println(sayi1+sayi2);
        scan.close();

    }
    public static void ucsayitoplama(){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter 3 number");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        double sayi3=scan.nextDouble();
        System.out.println(sayi1+sayi2+sayi3);
        scan.close();
    }

    public static void dortsayitoplama(){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter 3 number");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        double sayi3=scan.nextDouble();
        double sayi4=scan.nextDouble();
        System.out.println(sayi1+sayi2+sayi3+sayi4);
        scan.close();
    }


}
