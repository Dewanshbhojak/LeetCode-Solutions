class Solution {
    public boolean uniformArray(int[] nums) {
        int maxOdd = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int num : nums) {
            if (num % 2 != 0) {
                hasOdd = true;
                maxOdd = Math.min(maxOdd, num);
            }
        }

        if (!hasOdd) {
            return true;
        }
        for (int num : nums) {
            if (num % 2 == 0 && num < maxOdd) {
                return false;
            }
        }

        return true;
    }
}