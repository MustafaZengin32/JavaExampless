package whileloop;

public class While01 {
    public static void main(String[] args) {

        //Example 1: 3 to 10 , this number must be written at the same line

        int a=3;

        while (a<10) {

            System.out.print(" a = ;" + a);
            a++;
        }

        System.out.println();

        // Example 2 : 17 to 4 all even numbers must be written at same lone

        int b=17;

        while(b>4){

            if (b%2==0){
                System.out.print(" b = "+b);
            }

            b--;
        }

        System.out.println();

        // Example 3 : 17 to 67 all number's sum must be added

        int c=17;
        int sum=0;


        while(c<67){
            sum+=c;
            c++;

        }
        System.out.println(sum);

        System.out.println();

        // Example 4 : all digists must be added

        int d=365;//14
        int sum1=0;

        while (d>0){

            sum1=sum1+d%10;
            d/=10;
        }
        System.out.println(sum1);

        System.out.println();

        //Example 5 : the multiplication table

        int e=5;
        int multiply=1;
        int k=1;

        while (k<11){

            System.out.println("e * "+ k + " = " +e*k);
            k++;
        }











    }
}
