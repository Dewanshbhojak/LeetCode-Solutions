class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        int count= 0;
        for(int i :set) {
            if(!set.contains(i-1)){
                int j = i;
                int len = 0;
                while(true) {
                    if(set.contains(j)) {
                        len++;
                    }
                    else {
                        break;
                    }
                    j++;
                }
                count = Math.max(len,count);
            }
        }
        return count;
    }
}