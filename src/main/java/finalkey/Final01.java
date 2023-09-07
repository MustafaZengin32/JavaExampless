package finalkey;

public class Final01 {

    static final int OKUL = 111;

    public Final01() {
    }

    public static void main(String[] args) {

        int OKUL = 5;
        System.out.println(OKUL);
        System.out.println(Integer.MAX_VALUE);
        method1();
    }

        public static final void method1() {
            final int result=8;
            System.out.println(result);
        }

}