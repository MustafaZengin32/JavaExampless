package accessmodifier;

public class AccessModifeir01 {
    private int sayiPrivate = 10;
    int sayiDefault = 20;
    protected int sayiProtected = 30;
    public int sayiPublic = 40;

    public AccessModifeir01() {
    }

    public static void main(String[] args) {
        AccessModifeir01 obj = new AccessModifeir01();
        System.out.println(obj.sayiPrivate);
        System.out.println(obj.sayiDefault);
        System.out.println(obj.sayiProtected);
        System.out.println(obj.sayiPublic);
    }

    public void staticOlmayanMethod() {
        AccessModifeir01 obj = new AccessModifeir01();
        System.out.println(obj.sayiPrivate);
        System.out.println(obj.sayiDefault);
        System.out.println(obj.sayiProtected);
        System.out.println(obj.sayiPublic);
    }
}
