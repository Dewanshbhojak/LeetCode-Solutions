class Solution {
    public int minimumDeletions(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
       int right  = arr.length-Math.min(maxIndex,minIndex);
       int left = Math.max(maxIndex,minIndex)  + 1;

       int leftorright = Math.min(maxIndex,minIndex)+1+arr.length-Math.max(maxIndex,minIndex);

       return Math.min(leftorright,Math.min(right,left));
    }
}