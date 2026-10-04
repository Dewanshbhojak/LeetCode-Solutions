class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int count = 0;
        int max = 0;
        for(int i = 0;i<nums.length;i++) {
            if(nums[i]==0){
                count--;
            }else {
                count++;
            }
            int res = 0-count;
            if(map.containsKey(res))
            {
                max = Math.max(max,i-map.get(res));
            }
            map.putIfAbsent(res,i);
        }
        return max;
    }
}