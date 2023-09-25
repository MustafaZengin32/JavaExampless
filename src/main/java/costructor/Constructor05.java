package costructor;

public class Constructor05 {
    int x;
    int y;

    Constructor05() {
        this.x = 3;
        this.y = 5;
        ++this.x;
        System.out.println("-x" + this.x);
    }

    Constructor05(int i) {
        this();
        this.y = i;
        this.x += this.y;
        System.out.println("-x" + this.x);
    }

    Constructor05(int i, int i2) {
        this(3);
        this.x -= 4;
        System.out.println("-x" + this.x);
    }

    public static void main(String[] args) {
        Constructor05 c01 = new Constructor05(4, 3);
        System.out.println("c01 icin x :" + c01.x + ", c01 icin y :" + c01.y);

        Constructor05 c02 = new Constructor05();
        System.out.println("c02 icin x :" + c02.x + ", c02 icin y :" + c02.y);

       Constructor05 c03 = new Constructor05(7);
       System.out.println("c03 icin x :" + c03.x + ", c03 icin y :" + c03.y);
    }
}
