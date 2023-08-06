package variables;

public class Variables01 {
    // 1)Access Modifier  2)Data Type  3)Variable name  4) =   5) value 6);

    //  "statement" = sentence

    // "=" Assigemnt Operator

    // "Assigment Operator" right to the left

    public int age=13;


    //       Java Data Types

    /*
                                     Primitive Data Types

    1)int: Integer 32 bit

            min int = -2 147 483 648
            max int = 2 147 483 647

    2) byte:8 bit

            min byte = -128
            max byte = 127

    3) short:16 bit

            min short = -32768
            max short =  32767

     4) long:64 bit

            min long= -9 223 372 036 854 755 808 (9 kent trilyon...)
            max long=  9 223 372 036 854 755 807

      5) float:decimal number 32 bit
                "float" after comma 7 number
                "float"  "f" veya "F"

      6) double: decimal 64 bit
                 after comma 16 number

      7) boolean: true or false 1 bit

      8) char: only character 1 bit

                A, c, 2, ?, _, =,


      Note: char value with ' '

      Note: case sensitive
           TRUE - true


      Note: Numeric Data Types: byte   < short   < int      <  long    < float   < double
                                (8bit)   (16bit)   (32bit)     (64bit)   (32bit)   (64bit)


            Nun-Numaric  Data Types: boolean - char

            bsilfdbc
     */

    public byte price = 12;

    public short populationofvillage = 23000;

    public float priceofshirt = 13.99F;

    public double weightofcell = 0.00001245;

    // long  memoryn "int"
    //long out of range int  "L" or "l"

    public long populationofworld = 7000000000L;


    public long x=1234;
    // without l not problem because 1234 int range
    // here as int 32 bit

    public boolean isOld=true;

    public boolean isReach=false;

    public char initial='S';
    /*
                                     Non-Primitive Data Types

            String: name, adress, id no one or more characters
            String is in " "
            String non-primitive  java give you lots of methods

            Primitive and Non-Primitive diffrences

            1) Non-primitive with methods
               Primitive data types is without methods only values

            2) Primitive data types create by Java. Totatly 8 We can not create
               Non primitive data types are created by both Java and Us
               Non-Primitives are  pretty much.
               All classes are non-primitive

            3) Primitive data type start with small letters
               Non-Primitive data types start with big letters

            4) Primitive data type use different size in memory
               Non-Primitives use same size of memory

     */

    public String name ="Tom Hanks";

}
