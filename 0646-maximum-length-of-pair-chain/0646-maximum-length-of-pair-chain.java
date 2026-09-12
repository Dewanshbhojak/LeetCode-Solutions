class Solution {
    public int findLongestChain(int[][] arr) {
        int count = 0;
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
        int last = arr[0][1];
        for(int i = 1;i<arr.length;i++) {
           if(arr[i][0]>last){
            count++;
            last = arr[i][1];
           }
        }
        return count+1;
    }
}