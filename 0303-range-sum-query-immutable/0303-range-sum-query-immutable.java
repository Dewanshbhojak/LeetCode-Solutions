class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int l = left;
        int r = right;
        int sum = 0;
        while(l<=r) {
            if(l==r){
                sum+=nums[l];
            } else{
                sum+=nums[l] + nums[r];
            }
            l++;
            r--;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */