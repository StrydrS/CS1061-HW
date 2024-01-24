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
