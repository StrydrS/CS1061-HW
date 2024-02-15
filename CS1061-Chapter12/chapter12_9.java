public class chapter12_9 {
    public static void main(String[] args) {
        int x = 5;
        boolean y = true;
        boolean z;
        z = y && ++x == 6;
        y = x++ == 3;
        y = !z;
        System.out.println(x + " " + y + " " + z);
    
    
    }
}
