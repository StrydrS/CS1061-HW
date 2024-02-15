//retuurns false
// c=!(7<=6) evaluates to true
// d=7>=6 evaluates to true
// both statements evaluate to true, so the and statement is true
//the ! before the and statement means the entire statement 
//evaluates to false.

public class chapter12_5 {
    public static void main(String[] args) {
        boolean c = false;
        @SuppressWarnings("unused")
        boolean d = false;

        c = !((c=!(7<=6)) && (d=7>=6));

        System.out.println(c);
    }
}
