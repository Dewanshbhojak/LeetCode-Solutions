class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
         if(arr.length<4) return list;
        Arrays.sort(arr);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                int k = j+1;
                int l = arr.length-1;
               
                while(k<l){
                    long sum = (long)arr[i]+arr[j]+arr[k]+arr[l];
                    if(target == sum){
                         List<Integer> list1 = new ArrayList<>();
                        list1.add(arr[i]);
                        list1.add(arr[j]);
                        list1.add(arr[k]);
                        list1.add(arr[l]);
                        set.add(list1);
                        k++;
                        l--;

                    }
                    else if(target > sum) k++;
                    else if(target < sum) l--;
                }
            }
        }
        for(List<Integer> l1: set)
        list.add(l1);
        return list;
    }
}