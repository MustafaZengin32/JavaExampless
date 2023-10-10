package encaptulations;

public class Encapsulation02A {
    public Encapsulation02A() {
    }

    public static void main(String[] args) {
        Encapsulation02 ogr1 = new Encapsulation02();

        System.out.println(ogr1.isGecerMi());//49.9 oldugu icin false

        ogr1.setNot(60.0);//60 oldugu icin true 50 den buyuk

        System.out.println(ogr1.isGecerMi());
    }
}
