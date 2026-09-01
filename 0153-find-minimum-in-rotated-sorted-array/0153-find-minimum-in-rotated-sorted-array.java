class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(i<=j) {
            int mid = i+(j-i)/2;
            min = Math.min(min,nums[mid]);
            if(nums[mid]<nums[j]) {
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return min;
    }
}