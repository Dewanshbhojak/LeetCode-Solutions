class Solution {
    public boolean isMonotonic(int[] arr) {
        boolean inc = true;
        boolean dec = true;
        for(int i = 1;i<arr.length;i++){
                if(arr[i-1]>arr[i]){
                    inc = false;
                }
        }

        for(int i = 1;i<arr.length;i++){
             if(arr[i-1]<arr[i]){
                    dec = false;
                }
        }
        return inc|| dec;
    }
}