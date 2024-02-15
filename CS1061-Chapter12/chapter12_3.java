import java.util.Scanner;

public class chapter12_3 {
    public static void main(String[] args) {
        System.out.println(getOddDigit());
    }

    @SuppressWarnings("resource")
    public static int getOddDigit() {
        //take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an  odd number: ");
        String userInput = input.nextLine();

        //convert user input to integer
        int userNum = Integer.parseInt(userInput);
        if (userNum % 2 == 0) {
            System.out.println("That's not an odd number, try again!");
            return getOddDigit();
        } else {
            input.close();
            return userNum;
        }
}
}
