//unsure what instructions mean, my program is designed to 
// take input, for example "character" and take the first character
// 'c', then print the corresponding ascii value of that character. 
//for 'c',  it would print 99, the decimal value of 'c' in the ascii table.
//hope this is correct :)

import java.util.Scanner;

public class chapter12_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String userInput = input.nextLine();

        char firstChar = userInput.charAt(0);
        int firstCharValue = firstChar;

        System.out.print(firstCharValue);
        input.close();
    }
    
}
