package dowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //While loop is sometimes not executed
        int i = 1;
        while (i < 1) {
            System.out.println("While Loop");
            i++;
        }

        //for do-while loop it is not possible to zero execute

        int k = 1;
        double deneme = 25;

        do {
            System.out.println("do-while loop");
            k++;
        } while (k < 1);

        //Write the decimal part of the number on board
        double num= 24.5673;


        String new1= String.valueOf(Double.parseDouble(String.valueOf(num)));
        String new2=new1.substring(3);
        int new3=Integer.parseInt(String.valueOf(new2));
        System.out.println(new3);

        //This decimal part of the numbers sum must be written with do while loop

        int sum1=0;

        do{
            sum1+=new3%10;
            new3/=10;

        }while(new3>0);

        System.out.println(sum1);





    }
}
