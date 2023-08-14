package forloop;

public class ForLoop01 {
    public static void main(String[] args) {
        /*
        we use for loop with repetitive runs
        There is 4 types of loops

                i)   for-loop
                ii)  while-loop
                iii) do-while-loop
                iv)  for-each-loop
         */

        //Example 4: 14 to 5 write all even numbers to the screen

        for (int i = 14; i >4 ;i--) {
            if(i%2==0){
                System.out.println(i);
            }
        }

        //Example 7: change the "Java" to  "J*a*v*a*"

        String expession="Java";

        for (int i=0; i<expession.length(); i++) {
            //ilkinde ilk karakteri yaz ve yanina * ekle
            char karakter=expession.charAt(i);
            System.out.print(karakter+"*");
        }

        // Example 8: non-repeating characters writing
        //Hellooo Ali;  ===> He Ai

        System.out.println();

        String son="Hellooo Ali";

        for (int z = 0; z <son.length(); z++){
            char d=son.charAt(z);
            if (son.indexOf(d)==son.lastIndexOf(d)){
                System.out.print(d);
            }

        }
    }
}
