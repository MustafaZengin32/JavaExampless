package mathclass;

import java.util.Scanner;

public class Math02Example {
    public static void main(String[] args) {
        //take input and calculate hypothenus
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a");
        double a=scanner.nextDouble();
        System.out.println("please enter b");
        double b=scanner.nextDouble();

        double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(c);

        scanner.close();



    }
}
