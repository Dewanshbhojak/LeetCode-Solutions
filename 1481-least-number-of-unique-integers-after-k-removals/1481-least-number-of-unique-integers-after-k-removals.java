class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            if(map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        int index = 0;
        Collections.sort(list,(a,b)-> Integer.compare(a.getValue(),b.getValue()));
        for (int i = 0; i < k; i++) {
    int key = list.get(index).getKey();
    int val = list.get(index).getValue();

    if (val == 1) {
        map.remove(key);
        index++;
    } else {
        map.put(key, val - 1);
        list.get(index).setValue(val - 1);
    }
}
        return map.size();
    }
}