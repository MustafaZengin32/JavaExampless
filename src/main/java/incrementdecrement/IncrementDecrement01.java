package incrementdecrement;

public class IncrementDecrement01 {
    public static void main(String[] args) {
        int sayi1 = 10;
        sayi1 += 5;
        System.out.println(sayi1);//15
        System.out.println(sayi1);//15
        System.out.println(sayi1 + 12);//27
        System.out.println(sayi1);//15
        ++sayi1;
        System.out.println(sayi1);//16

        int sayi2 = 10;
        ++sayi2;
        ++sayi2;
        ++sayi2;
        System.out.println(sayi2);//13
        System.out.println(sayi2++);//13
        System.out.println(sayi2);//14
        ++sayi2;
        System.out.println(sayi2);//15

        int sayi3 = 10;
        --sayi3;
        System.out.println(sayi3);//9
        int a = sayi3--;
        System.out.println(a);//9
        System.out.println(sayi3);//8
        --a;
        System.out.println(a);//8
    }
}
