 class Average {
    public static void main(String[] args) {

        int[] responseTimes = {100, 200, 150, 300};

        int count = 0; 
        int sum = 0;   

         for (int i = 0; i < responseTimes.length; i++) {

            if (i == 0) {
                sum = responseTimes[i]; 
                continue; 
            }

             double average = (double) sum / i;
 
            if (responseTimes[i] > average) {
                count++; 
            }
            sum = sum + responseTimes[i];
        }
        System.out.println("Output: " + count);
    }
}
