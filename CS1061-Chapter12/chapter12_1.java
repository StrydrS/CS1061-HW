// when double variable overflows, it is marked as infinity
// if you divide an integer by biggestNum(infinity), you 
// get a value of 0. If you divide infinity by infinity
// you get NaN, or not a number

public class chapter12_1 {
    public static void main(String[] args) {
        
        Double bigNum = Double.MAX_VALUE - 100000000;
        Double biggerNum = bigNum * bigNum;
        Double biggestNum = Math.pow(bigNum, 23);
        
        System.out.println(biggerNum);
        System.out.println(biggestNum);
        

        //
        Double divideByBig = biggestNum / biggestNum;
        System.out.println(divideByBig);

        Double divideByBig2 = 10 / biggestNum;
        System.out.println(divideByBig2);
    }
}