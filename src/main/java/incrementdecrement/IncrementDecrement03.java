package incrementdecrement;

public class IncrementDecrement03 {
    public static void main(String[] args) {
        int numberr=10;


        // 1.

        numberr = numberr + 5;
        // 2.

        numberr += 8;

        // 3.

        numberr++;

        // for all operators
        // 3. is only for plus operator


        numberr -= 6;


        numberr /= 2 ;


        numberr *= 3;


        numberr--;

        int num = 20 ;

        num++;

        System.out.println(num); // 21

        System.out.println(num++); // 21

        System.out.println(num); // 22

        System.out.println(++num); // 23 direct

        System.out.println(num); // 23

        int x= 3;

        int y = 2 * ++x ; //y 8 x 4

        int z= 5 + y-- ;// z 13 y 7

        System.out.println(x+y+z);// 4 7 13 // 24
    }
}
