// Write a program that performs a one-position left rotation of the elements in
// an array. Demonstrate the effect by having the program rotate the elements in this
// particular array:
// String[] scientists = {"Sheldon", "Amy", "Raj"};
// The rotation should change the sequence of the array’s elements to: “Amy,” “Raj,” and
// “Sheldon.” Then it should print the new sequence. Your solution should perform the
// rotation without creating another array, although you will need a variable to temporarily
// hold an element’s value.

public class chapter9_8 {
    public static void main(String[] args) {
        String[] scientists = { "Sheldon", "Amy", "Raj"};
        String temp = scientists[0];
        int i;

        for(i = 0; i < scientists.length-1; i++) {

            scientists[i] = scientists[i+1];
            
        }

        scientists[i] = temp;

        for(int z = 0; z < scientists.length; z++){ 
            System.out.print(scientists[z]);
            if(z<scientists.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
