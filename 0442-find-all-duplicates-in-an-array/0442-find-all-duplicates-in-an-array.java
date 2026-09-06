class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<arr.length) {
            int index = arr[i]-1;
            if(arr[index]!=arr[i]) {
                int temp = arr[index];
                arr[index]= arr[i];
                arr[i] = temp;
                
            }else{
                i++;
            }
        }
        for(int j =0;j<arr.length;j++) {
            if(arr[j]!=j+1){
                list.add(arr[j]);
            }
        }
        return list;
    }
}