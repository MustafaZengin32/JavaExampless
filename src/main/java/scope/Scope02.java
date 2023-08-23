package scope;

public class Scope02 {
    static int no = 20;
    static int sayi;
    static String adres = "Ankara";
    static String cadde;
    static boolean aktifMi = true;
    static boolean tatildeMi;

    public Scope02() {
    }

    public static void main(String[] args) {
        System.out.println(no);//20
        ++no;
        System.out.println(no);//21
        staticMethod();//22
        System.out.println(no);//22
        Scope02 obje = new Scope02();
        obje.staticOlmayanMethod();//23
        System.out.println(no);//23
    }

    public static void staticMethod() {
        ++no;
        System.out.println("static method'da sayi : " + no);
    }

    public void staticOlmayanMethod() {
        ++no;
        System.out.println("static olmayan method'da sayi : " + no);
    }
}
