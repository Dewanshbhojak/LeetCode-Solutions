class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int sum = 0;
        int len = Integer.MAX_VALUE;
        int start = 0;
        for(int i = 0;i<arr.length;i++) {
            sum+=arr[i];
            while(sum>=target) {
                len = Math.min(len,i-start+1);
                sum-=arr[start];

                start++;
            }
           
        }
        if(len ==Integer.MAX_VALUE) return 0;
        return len;
    }
}