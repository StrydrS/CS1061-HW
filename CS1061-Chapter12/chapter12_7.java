//a) evaluates to 17 (a + b--)
//b) compilation error, cannot convert from double to int (a = x = -12)
//c) evaluates to 10 (8 + a * ++b / 20)
//d) evaluates to 6.333333333333334 (a + 7 / (x + 12.1))
//e) evaluates to 9 (a + (b=5) % 9)

public class chapter12_7 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int a = 4;
        
        int b = 13;
        double x = -9.1;

        System.out.println(a + (b=5) % 9);

    }
}
