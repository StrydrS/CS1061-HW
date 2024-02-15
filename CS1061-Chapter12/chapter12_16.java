import java.util.Scanner;
import java.util.ArrayList;

public class chapter12_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> stocks = new ArrayList<Double>();
        double stock;

        System.out.println("Enter a stock value (-1 to quit): ");
        stock = input.nextDouble();
        while(stock >= 0) {
            stocks.add(stock);
            System.out.println("Enter a stock value (-1 to quit): ");
            stock = input.nextDouble();
        }

        System.out.printf("\nAverage stock value: %.2f\n", 
            stocks.stream()
                  .peek(previous -> System.out.println("Previously entered value: " + previous))
                  .mapToDouble(Double::doubleValue)
                  .average()
                  .orElse(0.0)
        );
    }
}
