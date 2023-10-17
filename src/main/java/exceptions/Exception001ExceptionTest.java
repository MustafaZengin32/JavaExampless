package exceptions;

public class Exception001ExceptionTest {

    public static void main(String[] args) {

        try {


            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);

            double ergebnis = divide(dividend, divisor);

            System.out.println("Das Ergebnis der Division lautet: " + ergebnis);

        }

        catch (Exception001DivisionByZeroException e) {

            System.out.println(e.getMessage());

            e.printStackTrace();

        }

    }
        public static double divide( int dividend, int divisor) throws Exception001DivisionByZeroException{

            double ergebnis = 0;

            if (divisor != 0) {
                ergebnis = dividend / divisor;
            } else {
                /* Hier wird unsere Exception geworfen */
                throw new Exception001DivisionByZeroException();

            }


            return ergebnis;
        }


    }

