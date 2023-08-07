package typecasting;

public class TypeCasting04 {
    public static void main(String[] args) {
        // create byte and do step by step AUTO WIDENING

        byte numByte= 45;

        System.out.println("byte value : " + numByte);

        // short

        short numShort = numByte;// Auto Widening

        System.out.println("short variable : " + numShort);

        int numInt = numShort;

        System.out.println("Integer value : " + numInt);

        float numFloat= numInt;
        System.out.println("float value : " + numFloat);

        double numDouble = numFloat;

        System.out.println("double value : " + numDouble);

    }

}
