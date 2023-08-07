package typecasting;

public class TypeCasting01 {
    public static void main(String[] args) {
        //Type Casting: one numeric data type change th other numeric data type
        // byte < short < int < long < float < double
        // left to the right "Auto Widening" (otomatik genisletme) byte to int
        // right to the left "Explicit Narrowing"

        byte age=23;

        int newAge=age;

        // small box to big box easy , java make this Automatically

        long populataion=1234;

        int newpopulation= (int) populataion;


        // Example 1: short to  double
        //            float to byte

        short numOfStudent=235;

        double newNumOfStudent=numOfStudent;

        float price=12.99F;

        byte newPrice=(byte)price;  //Explicit Norrwing

        System.out.println(newPrice);


        int number = 515;

        byte newNumber = (byte)number;

        System.out.println(newNumber);//515/256 //3

        int num=510;

        byte newNum=(byte)num;

        System.out.println(newNum); //-2 ==> 510/256

    }
}
