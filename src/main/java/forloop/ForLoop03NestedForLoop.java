package forloop;

public class ForLoop03NestedForLoop {
    public static void main(String[] args) {
        /*
            Example 1: write as under // 3 week //3 day
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        for (int i = 1; i <4;i++){
            System.out.println("Week : " + i);
            for (int j = 1; j <4; j++){
                System.out.println("Day : " + j);
            }
        }

        /*Example 2: write as under
                                1
                                1 2
                                1 2 3
                                1 2 3 4
                                1 2 3 4 5
                 */

        int satir=5;

        for (int i = 1; i <satir+1; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*
        Example 3: write as under 5 line // 4 3 2 1

                * * * * *
                * * * *
                * * *
                * *
                *
         */

        int satir1=5;

        for (int i=1; i<6 ; i++){
            for (int j=5; j>=i; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println();
        /*

        *
		* *
		* * *
		* * * *

         */

        for (int i=1; i<5 ; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
