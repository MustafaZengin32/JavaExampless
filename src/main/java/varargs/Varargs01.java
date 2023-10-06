package varargs;

public class Varargs01 {
    public static void main(String[] args) {
        /*
         Bir method'da parametre sayisini sinirlandirmak istemezsek
         standart bir variable yerine varargs kullaniriz

         vararg data turunun yanina ... konularak deklare edilir
         int...  ==> sayisi belirli olmayan int parametreler alan bir array'dir
         */

        // public static void method1(int... sayilar, int s, int t){
        // method'da parametre olarak varargs varsa, son parametre olmasi ZORUNLUDUR
        // bu durumda bir method'da 2 varargs parametre OLAMAZ
        // }

            int a = 10;
            int b = 20;
            int c = 30;
            int d = 40;
            int e = 50;
            int f = 60;
            topla(a, b);
            topla(a, b, c);
            topla(a, b, c, d);
            topla(a, b, c, d, e);
            topla(a, b, c, d, e, f);
        }

        private static void topla(int... a) {
            System.out.println("varargs calisir");
        }

        private static void topla(int a, int b, int c) {
            System.out.println("uc sayinin toplami : " + (a + b + c));
        }

        private static void topla(int a, int b) {
            System.out.println("iki sayinin toplami : " + (a + b));
        }

    }

