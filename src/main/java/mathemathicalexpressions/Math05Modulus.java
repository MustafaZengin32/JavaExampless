package mathemathicalexpressions;

public class Math05Modulus {
    public static void main(String[] args) {

        // 15 t c ? 15/2 kalan=1
        // 25  ? 25/3 kalan=1

        int kalan= 15 % 4 ;
        System.out.println(kalan); // 3

        System.out.println(26 % 8); // 2

        // 856 ones digit ? 6
        int sayi=856;
        int birlerBasamagi = sayi % 10 ;
        System.out.println("sayinin birler basamagi : " + birlerBasamagi);//6

        // 856 tens digit ?
        sayi/=10; // 85
        System.out.println("on'a boldukten sonra sayinin degeri : " + sayi);
        int onlarBasamagi= sayi % 10;
        System.out.println("Onlar basamagi : " + onlarBasamagi);//5

        sayi/=10;
        System.out.println("2.defa 10'a boldukten sonra " + sayi);//8
        int yuzlerBasamagi=sayi%10;
        System.out.println(yuzlerBasamagi);

    }
}
