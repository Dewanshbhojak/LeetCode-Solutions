class Solution {
    public void dfs(LinkedList<Integer> list , int val ,int count,HashSet<Integer> set) {
        if(count==0){
            if(val%2==0){
                set.add(val);
            }
            return;
        }
        if(count<0) return ;
        for(int i = 0;i<list.size();i++) {
            if(count == 3 && list.get(i)==0) continue;
            int v = list.get(i);
            val = val*10 + list.get(i);
            list.remove(i);
            dfs(list,val,count-1,set);
            list.add(i,v);
            val = val/10;
            
        }

    }
    public int totalNumbers(int[] digits) {
        boolean odd = true;
        for(int i:digits){
            if(i%2==0) {
                odd = false;
            }
        }
        if(odd) return 0;
       	LinkedList<Integer> list = new LinkedList<>();
        for(int i : digits) {
            list.add(i);
        }
        HashSet<Integer> set = new HashSet<>();
        dfs(list,0,3,set);
        System.out.println(set);
        return set.size();

    }
}