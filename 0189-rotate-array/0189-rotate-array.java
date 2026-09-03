class Solution {
    
    public void rotate(int[] nums, int k) {

        if(k > nums.length) k = k % nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length-k;i++) {
            list.add(nums[i]);
        }
        int index = 0;
        for(int i = nums.length-k;i<nums.length;i++){
            nums[index] = nums[i];
            index++;
        }
        for(int i :list){
            nums[index] = i;
            index++;
        }
    }

}