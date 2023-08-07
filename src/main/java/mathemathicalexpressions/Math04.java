package mathemathicalexpressions;

public class Math04 {
    public static void main(String[] args) {

        int num1= 38 / 2 *( 4 + 3 ) * 2;// 19 7 2

        System.out.println(num1); //266

        int num2 = 8 + 2 * ( 14 - 6 / 2 ) - 12 ;

        System.out.println(num2); // 18

        int num3=10;

        double num4 = num1 * num2 /num3; // 266 * 18 /10 = 478.8 ==>478

        System.out.println(num4);

        double num5=24.56;
        double num6=14.2;
        double num7 = num5 / num6 ;

        System.out.println(num7); // 1.7295774647887323

        System.out.println(num5 / num3); // 24.56 / 10 = 2.456


        double num8 = (double) num1 * num2 /num3; // 478.8
        System.out.println(num8); // 478.8
    }
}
