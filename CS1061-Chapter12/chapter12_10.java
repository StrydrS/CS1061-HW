// result is "8.5 false true"

public class chapter12_10 {
    public static void main(String[] args) {
        boolean x;
        boolean y = false;
        double z = 9.5;

        x = y || (--z == 8.5);
        y = !x && (--z == 7.5);
        System.out.println(z + " " + y + " " + x);
    }
}
