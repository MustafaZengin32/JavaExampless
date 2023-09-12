package accessmodifier;

public class AccessModifeir03A {
    public static void main(String[] args) {
        //Normally you can not access private data but there is getter method ,
        // that is way you were able to access to prive data due to getter method
        AccessModifeir03 obj1 = new AccessModifeir03();
        System.out.println(obj1.getAsgariMaas());
    }
}
