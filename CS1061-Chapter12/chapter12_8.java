//a) evaluates to "Go-13" (str + m + 3)
//b) evaluates to "Go2" (str + (m + 3))
//c) evaluates to 111 (c + m)
//d) evaluates to 57 (7 + '2')
//e) evaluates to 'Go! ("\'" + str + '!')




public class chapter12_8 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int m = -1;
        char c = 'p';
        String str = "Go";


        System.out.println("\'" + str + '!');
    }
}
