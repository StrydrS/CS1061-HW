import java.math.*;

public class chapter12_2 {

        public static void main(String[] args) {
            BigInteger bigI = new BigInteger("24242424242424242424242425");
            BigDecimal bigD = new BigDecimal(bigI);

            BigDecimal divisor = new BigDecimal(3.0);
            BigDecimal quotient;
    
            System.out.println("Original Number: " + bigI);

            
            quotient = bigD.divide(divisor, 5, RoundingMode.HALF_UP);
            int newScale = 30-quotient.precision()+quotient.scale();
            quotient = quotient.setScale(newScale, RoundingMode.HALF_UP);
            System.out.println("When divided by 3 and the result uses 30 significant digits: " + quotient);
            

            //insert
            quotient = bigD.divide(divisor, 4, RoundingMode.HALF_UP);
            System.out.println("When divided by 3 and the result uses 4 fractional digits: " + quotient);

        }

    }