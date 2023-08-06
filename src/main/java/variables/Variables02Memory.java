package variables;

public class Variables02Memory {
    /*
        1)There is two memory in Java
            i)Stack Memory:
                a)small memory
                b)Primitive and Non-Primitives References are included in there

           ii)Heap Memory:
                a)big Memory
                b)Non-Primitives are included in there

        2)Creates an address(Reference) for each non-primitive data placed in Java Heap Memory

          and place this Reference in Stack Memory

          If this address(Reference) is deleted anyway , Java delete this data in Heap Memory

          There is a "Garbage Collector" that cleans the memory that responsible for this

          Note: Class ==> Variable ==> Object
                          Method
     */
    public static void main(String[] args) {


        int age=13;
        int hieght=183;
        short villegeofpopulation=2300;
        long worldofpopulation=745685445;
        char a='2';
        String UserName="Tom";
        System.out.println(UserName);


    }


}
