class Solution {
    public void dfs(int[] arr, HashSet<List<Integer>> list, List<Integer> list1, int n,int prev) {
        if(n>arr.length-1 && list1.size()>=2) {
          list.add(new ArrayList<>(list1));
            return;
        }
        if(n>arr.length-1) return;
        if(prev <= arr[n]) {
            list1.add(arr[n]);
            dfs(arr,list,list1,n+1,arr[n]);
            list1.remove(list1.size()-1);
        }
         dfs(arr,list,list1,n+1,prev);
    }
    public List<List<Integer>> findSubsequences(int[] arr) {
        HashSet<List<Integer>> list = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        dfs(arr,list,list1,0,Integer.MIN_VALUE);
        List<List<Integer>> res = new ArrayList<>();
        for(List<Integer> list2:list){
                res.add(list2);
        }
        return res;
    }
}