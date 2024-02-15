// result is 4
//this is a ternary operator, which means that
// if flag is set to true, the result will be x, 
//if the flag is set to false, the result will be y-0.7
// cast to an int, which would be 4. 

public class chapter12_6 {
    public static void main(String[] args) {
        boolean flag = false;
        int x = -3;
        double y = 5.0;

        int result = flag ? x: (int)(y-0.7);

        System.out.println(result);
    }
}
