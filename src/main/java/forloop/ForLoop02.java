package forloop;

public class ForLoop02 {
    public static void main(String[] args) {

        //Example 1: 3 to 6 (all number sum)

        int sum =0;

        for (int i = 3; i <7 ;i++) { //3 4 5 6
            sum +=i;
        }
        System.out.println(sum);

        //Example 2: 6 to 3 (all number multiply)

        int multiply=1;

        for (int i = 6; i >2;i--) { //6 5 4 3
            multiply*=i;
        }

        System.out.println(multiply);

        // Example 3  all digits of number sum

        int number=365; // 3+8+5 = 16
        int sum1=0;

        for (; number>0; number/=10) {

            sum1=sum1+number%10;

        }
        System.out.println(sum1);

        //Example 4: reverse String expression

        String expression1="Mustafa";

        for(int i=expression1.length()-1; i>=0; i--) {
            char yeni=expression1.charAt(i);
            System.out.print(yeni);
        }

        //Example 5 : except m , write all character
        //Andrommedam==>Androeda

        System.out.println();

        String first1="Andrommedam";

        for (int i = 0; i <first1.length(); i++) {
            if (first1.charAt(i)!='m'){
                System.out.print(first1.charAt(i));
            }
        }

        //Example 6 : it must be  printed all number except diviseble 6

        for (int i = 0; i <20;i++){
            if (i%6==0){
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println();
        //Example 7 : it must be printed before 'm' charachter
        // Luxemburg ==> Luxe

        String str ="Luxemburg";

        for (int i = 0; i <str.length()-1;i++){
            if (str.charAt(i)=='m'){
                break;
            }
            System.out.print(str.charAt(i));
        }







    }
}
