package typecasting;

public class TypeCasting05 {
    public static void main(String[] args) {
        // create double and do casting firt int and then byte

        double numDouble=129.56;//bsilfd

        int numInt = (int) numDouble;
        // while double to int java delete decimal part of number

        System.out.println("integer value  : " + numInt);//129

        byte numByte= (byte) numInt;//127//129/256

        System.out.println("byte value: " + numByte);

    }

}
