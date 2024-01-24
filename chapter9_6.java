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

