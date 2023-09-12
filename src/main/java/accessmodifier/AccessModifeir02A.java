package accessmodifier;

public class AccessModifeir02A {
    public static void main(String[] args) {
        AccessModifeir02 obj = new AccessModifeir02();
        System.out.println(obj.isim);
        System.out.println(obj.maas);

        obj.isim = "Veli Cem";
        obj.maas = 15000;
        System.out.println(obj.isim);
        System.out.println(obj.maas);
    }
}
