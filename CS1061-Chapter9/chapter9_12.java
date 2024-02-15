

public class chapter9_12 {
    public static void main(String[] args) {
        double[][] rectangles = {{1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}};

        for(int i = 0; i < rectangles.length; i++) {
            for(int j = 0; j < rectangles[i].length; j++) {
                System.out.print(rectangles[i][j] + " ");
            }
            System.out.println();
        }
    }
}
