class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro = 1;
        int j = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
          pro*=nums[i];
          while(pro>=k && j<=i){
                pro/=nums[j];
                j++;
          }
          count+=i-j+1;
        }
        return count;
    }
}