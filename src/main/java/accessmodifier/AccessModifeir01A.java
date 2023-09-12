package accessmodifier;

public class AccessModifeir01A {
    public static void main(String[] args) {
       AccessModifeir01 obj = new AccessModifeir01();
        System.out.println(obj.sayiDefault);
        System.out.println(obj.sayiProtected);
        System.out.println(obj.sayiPublic);
        //System.out.println(obj.sayiPrivate);can not be reached because it is private
    }

    public void staticOlmayanMethod() {
       AccessModifeir01 obj = new AccessModifeir01();
        System.out.println(obj.sayiDefault);
        System.out.println(obj.sayiProtected);
        System.out.println(obj.sayiPublic);
    }
    
}
