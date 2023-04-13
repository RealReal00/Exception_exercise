/**
 * Write a function receiving two double numbers (a, b) and returning their division. If b == 0, the function throws
 * IllegalArgumentException
 */
public class Es_5 {
    public static double divisione(double a, double b)   {
         if (b == 0) {
            throw new IllegalArgumentException();
        }

         else{

            double d = a / b;
            return d;
            }

    }

    public static void main(String args[]) {
        double ris = divisione(5, 0);
        System.out.println(ris);
    }
}
