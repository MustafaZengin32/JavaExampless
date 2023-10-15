package interfaces;

public class Interface01Runner implements Interface01Second {

    public static void main(String[] args) {

        // static olarak tanimlanmis bir variable veya method
        // baska class'dan classIsmi.methodIsmi seklinde cagrilabilir

        Interface01Second.deneme2();

        // Default keyword'u ile olusturdugumuz method ise
        // obje uzerinden cagrilabilir

        Interface01Runner obj1= new Interface01Runner();
        obj1.deneme();

    }
}
