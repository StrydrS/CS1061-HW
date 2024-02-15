//very gross for loop


public class chapter12_12 {
    public static void main(String[] args) {
        for (int m = 0, n = 1, temp; m < 25; temp = m, m = n, n = temp + n) {
            System.out.print(m + " ");
                }
            }
}