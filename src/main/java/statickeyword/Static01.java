package statickeyword;

public class Static01 {

    static {
        System.out.println("static blok main method'dan bile once calisir ");
        System.out.println("static blok nereye yazilirsa yazilsin main method'dan bile once calisir ");
    }

    public Static01() {
    }

    public static void main(String[] args) {
        System.out.println("Javada once main method calisir");
    }
}


