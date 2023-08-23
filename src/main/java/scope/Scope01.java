package scope;

public class Scope01 {

    int notMat = 50;
    int notFen;

    public Scope01() {
        
    }

    public static void main(String[] args) {

        Scope01 alex = new Scope01();
        System.out.println(alex.notMat);
        
        Scope01 lara = new Scope01();
        lara.notMat = 70;
        System.out.println(lara.notMat);
        System.out.println(alex.notMat);

        alex.notMat = 90;
        System.out.println(alex.notMat);
        alex.method2();

    }

    public void method2() {
        System.out.println("method2 notfen : " + this.notFen);//0
        this.notFen = 100;
        System.out.println("method2 correct notfen : " + this.notFen);//100
    }
}
