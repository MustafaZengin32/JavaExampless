package whileloop;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {

        //Example 1: find the divisors of the number

        int a=18;
        int bolen=1;

        while (a>0 && bolen<=a){

            if (a%bolen==0){
                System.out.println(bolen);
            }
            bolen++;
        }

       //Exampe 2 : Between A and D all char values must be written

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a word that last letter must be bigger than first");
        String word=scanner.nextLine();

        char firstletter=word.toUpperCase().charAt(0);
        char lastletter=word.toUpperCase().charAt(word.length() - 1);

        while(lastletter>firstletter){
            ++firstletter;
            System.out.println(firstletter);
        }




    }
}
