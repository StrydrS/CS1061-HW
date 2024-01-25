// // Given the following allPrices initializer, provide a declaration statement for
// an suvPrices array such that the new array is half the size of the allPrices array. You can
// assume that there are an even number of elements in the allPrices array. Provide an
// arraycopy method call that copies half of the values—the smaller-index values—from
// allPrices to suvPrices.
// 
// 
 class chapter9_6 {
     public static void main(String[] args) {
        double[] allPrices = {10000, 11000, 25000, 18000, 30000, 9000, 12000, 21000};

        double[] suvPrice = suvPrices(allPrices);

        for(int i = 0; i < suvPrice.length; i++) {

            System.out.println(suvPrice[i]);
        }
    
    }

        private static double[] suvPrices(double[] allPrices) {
            double[] suvPrice = new double[allPrices.length/2];

            for(int i=0; i < suvPrice.length; i++) {
                suvPrice[i] = allPrices[i];
            }

            return suvPrice;
        }

 }

