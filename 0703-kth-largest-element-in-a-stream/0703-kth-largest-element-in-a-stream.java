class KthLargest {
    int k ;
   ArrayList<Integer> list = new ArrayList<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
       for(int i : nums) {
        list.add(i);
       }
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list,(a,b)->Integer.compare(b,a));
        
        
        return list.get(k-1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */