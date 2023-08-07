package mathemathicalexpressions;

import java.util.Scanner;

public class Math06DigistsSum {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 4 digits number");//1256 // 14
        int sayi=scanner.nextInt();

        int sum=0;
        int onesdigit=sayi%10;
        System.out.println(onesdigit);//6

        int tensdigit=(sayi/10)%10;
        System.out.println(tensdigit);//5

        int hundredsdigits=(sayi/100)%10;
        System.out.println(hundredsdigits);//2

        int thousandsdigits=(sayi/1000)%10;
        System.out.println(tensdigit);//1

        sum=onesdigit+tensdigit+hundredsdigits+thousandsdigits;
        System.out.println(sum);//14





    }
}
