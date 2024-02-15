//calculates the factorial of a given number
// output for the given code is 24, which is 4!


public class chapter12_11 {
    public static void main(String[] args) {
        int number = 4;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("factorial(" + number + ") = " + factorial);
    }
}
