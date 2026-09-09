class Solution {
    public long countCommas(long n) {

        if (n <= 999) {
            return 0;
        }

        long count = 0;

        if (n <= 999999) {
            return n - 1000 + 1;
        }

        count += 999999 - 1000 + 1;

      
        if (n <= 999999999) {
            count += (n - 1000000 + 1) * 2;
            return count;
        }

        count += (999999999 - 1000000 + 1) * 2;

   
        if (n <= 999999999999L) {
            count += (n - 1000000000L + 1) * 3;
            return count;
        }

        count += (999999999999L - 1000000000L + 1) * 3;

       
        if (n <= 999999999999999L) {
            count += (n - 1000000000000L + 1) * 4;
            return count;
        }

        count += (999999999999999L - 1000000000000L + 1) * 4;

      
        count += (n - 1000000000000000L + 1) * 5;

        return count;
    }
}
