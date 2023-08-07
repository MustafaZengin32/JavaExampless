package incrementdecrement;

public class IncrementDecrement02 {
    public static void main(String[] args) {
        int num = 15;

        int num2 = num + 2;

        System.out.println("num2 = " + num2);//17
        System.out.println("num = " + num);//15

        num = num+5;

        System.out.println("num = " + num);//20

        System.out.println(num+12); // 32

        num = num+8; // num=28

        num += 5; // num=33

        System.out.println("num= " + num);//33


        num +=10; // num =43


        num+=1; // num=44


        num++; // num=45

        System.out.println("last num : " + num);


    }
}
