
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list  = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i< nums.length;i++) {
            int j = i+1;
            int k = nums.length-1;
            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0) {
                    if(!set.contains(nums[i]+","+nums[j]+","+nums[k])){
                        set.add(nums[i]+","+nums[j]+","+nums[k]);
                    }
                        k--;
                        j++;
                }
                else if(sum > 0) {
                    k--;
                }else if(sum<0) {
                    j++;
                }
            }
        }
        for(String s: set) {
            String[] str = s.split(",");
            int i = Integer.parseInt(str[0]);
            int j = Integer.parseInt(str[1]);
            int k = Integer.parseInt(str[2]);
            List<Integer> list1 = new ArrayList<>();
            list1.add(i);
            list1.add(j);
            list1.add(k);
            list.add(list1);
        }
        return list;
    }
}