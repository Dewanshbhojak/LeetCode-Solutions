class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            int rem = (i%value+value)%value;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        int i = 0;
        while (map.getOrDefault(i%value,0)>0) {
            map.put(i%value,map.get(i%value)-1);
            i++;
            
        }
        return i;
    }
}