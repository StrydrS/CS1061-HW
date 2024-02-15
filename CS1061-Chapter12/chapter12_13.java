//badProg(); contains the code from the text, 
//goodProg() contains my implementation of the code from the text


import java.util.Scanner;

public class chapter12_13 {
    public static void main(String[] args) {
        //badProg();
        goodProg();
        }

    public static void badProg() {
        Scanner input = new Scanner(System.in);
        @SuppressWarnings("unused")
        String allEntries = "";

        for (String entry="";;) {
            System.out.print("Make entry or 'q' to quit: ");
            entry = input.nextLine();
            if (entry.equals("q")) {
                break;
            } else {
                allEntries += " " + entry;
            }
        }
        input.close();
    }

    public static void goodProg() {
        Scanner input = new Scanner(System.in);
        @SuppressWarnings("unused")
        String allEntries = "";
        String entry = "";

        while(!entry.equals("q")) {
            System.out.print("Make entry or 'q' to quit: ");
            entry = input.nextLine();
            allEntries += " " + entry;
        }
        input.close();
    }
}
