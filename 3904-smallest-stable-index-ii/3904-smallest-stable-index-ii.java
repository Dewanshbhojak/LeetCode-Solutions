class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int[] max= new  int[nums.length];
        int[] min = new int[nums.length];
        int maxi = Integer.MIN_VALUE;
        int mini= Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++) {
            maxi = Math.max(maxi,nums[i]);
            max[i] = maxi;
           
        }
        for(int i = nums.length-1;i>=0;i--) {
            mini = Math.min(mini,nums[i]);
            min[i] = mini;
            
        }
         for(int i = 0;i<nums.length;i++) {
             if(max[i]-min[i] <=k) return i;
        }
        return -1;
    }
}