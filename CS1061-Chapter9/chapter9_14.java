

public class chapter9_14 {
    public static void main(String[] args) {
        int[][] origin = {{1,2,3, 4, 5 ,6 ,7,8 }, {2014,2002,1999, 2020, 2012, 1947, 32, 1111}};
        int currentYear = 2024;
        int[][] mask = getVotingMask(origin, currentYear);

        for(int i = 0; i < mask[0].length; i++) {
            System.out.println(mask[1][i]);
        }
        

    }   
    
    private static int[][] getVotingMask(int[][] birth, int currentYear) {
        int[][] mask = new int[birth.length][birth[1].length];
        int row = 0;

        while(row < birth.length) {
            for(int i = 0; i < birth[row].length; i++) {
                if(currentYear -  birth[row][i] < 18) {
                    mask[row][i] = 0;
                } 
                else if(currentYear - birth[row][i] > 18) {
                    mask[row][i] = 1;
                }
            }
            row++;
        }

        return mask;
    }
}
