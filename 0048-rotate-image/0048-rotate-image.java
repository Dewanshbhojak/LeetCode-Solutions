class Solution {
    public void rotate(int[][] arr) {
        for(int i  = 0;i< arr.length;i++) {
            for(int j = 0;j< arr[i].length;j++) {
                if(i==j|| i>j) {
                    continue;
                }
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        int i = 0;
        int j = arr[0].length-1;
        while(i<j) {
            for(int k = 0;k<arr.length;k++) {
                 int temp = arr[k][i];
                arr[k][i] = arr[k][j];
                arr[k][j] = temp;
            }
            i++;
            j--;
        }
    }
}