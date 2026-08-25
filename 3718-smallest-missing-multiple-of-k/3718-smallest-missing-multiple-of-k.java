class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        int i = 1;
        int mul = k;
        while(true){
            if(!set.contains(mul)) {
                return mul;
            }
            mul=k*i;
            i++;
        }

    }
}