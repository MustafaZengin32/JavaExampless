package variables;

public class Variables04 {
    public static void main(String[] args) {
        int sayi; //
        sayi=27;

        char ilkHarf='M';

        System.out.println(ilkHarf); // println bottom line

        System.out.println(sayi + ilkHarf); //27 + 77 =104

        //Ascii value (if char with plus)

        String ismim="Ali ";
        String soyisim="Can";

        System.out.print(ismim);
        System.out.println(soyisim);


        System.out.println(ismim + ' ' + soyisim);
        System.out.println(ismim + " "  + soyisim);
        // String  +

        char bosluk = ' ';

        System.out.println(ismim+bosluk+soyisim);

        String isim1="Java";
        String isim2="Guzel";

        // Java Guzel
        System.out.println(isim1+" " + isim2);

        int sayi1=5;
        int sayi2=7;

        System.out.println(sayi1+sayi2+isim1); // 12Java
        System.out.println(isim1+sayi1+sayi2); // Java57

        int sayi3=10;
        int sayi4=4;
        double sayi5=4;


        System.out.println(sayi3/sayi4); //  10/4=2

        System.out.println(sayi3/sayi5); // 10/4=2.5
    }
}
