
class Pair {
    int first ;
    int second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public String toString() {
        return first+"@"+second;
    }
}
class Solution {
    public int[][] insert(int[][] arr1, int[] newInterval) {
        int[][] arr =new int[arr1.length+1][2];
        int i = 0;
        for(;i<arr1.length;i++){
            arr[i][0] = arr1[i][0];
            arr[i][1] = arr1[i][1];
        }
        arr[i][0] = newInterval[0];
        arr[i][1] = newInterval[1];
        Arrays.sort(arr,(a,b)->{
            if(a[0]!=b[0]) {
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
       ArrayList<Pair> list = new ArrayList<>();
       int first = arr[0][0];
       int second = arr[0][1];
       i=1;
       for(;i< arr.length;i++) {
        if(second >= arr[i][0]) {
            if(second <arr[i][1] ) second= arr[i][1];
        }else {
         
            list.add(new Pair(first,second));
            first = arr[i][0];
            second = arr[i][1];
        }
       }
         list.add(new Pair(first,second));
      int[][] res = new int[list.size()][2];
      for(int j = 0;j<res.length;j++) {
        res[j][0] = list.get(j).first;
        res[j][1] = list.get(j).second;
      }
       return res;
    }
}
