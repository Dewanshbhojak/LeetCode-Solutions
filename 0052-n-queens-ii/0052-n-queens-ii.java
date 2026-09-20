class Solution {
    public boolean check(int[][] arr , int row, int col){
            for(int i = 0;i<arr.length;i++) {
                if(arr[i][col]==1) return false;
            }
             for(int i = 0;i<arr.length;i++) {
                if(arr[row][i]==1) return false;
            }
             int r = row - 1;
        int c = col - 1;

        while (r >= 0 && c >= 0) {
            if (arr[r][c] == 1)
                return false;

            r--;
            c--;
        }

        r = row - 1;
        c = col + 1;

        while (r >= 0 && c < arr.length) {
            if (arr[r][c] == 1)
                return false;

            r--;
            c++;
        }

        return true;
            
    }
    public int way(int[][] arr, int n){
        if(n == arr.length) {
            return 1;
        }
        int res=  0;
        for(int i = 0;i< arr[0].length;i++) {
            if(check(arr,n,i)) {
                arr[n][i] = 1;
              res += way(arr,n+1);
                arr[n][i] = 0;
            }
        }
        return res;
    }
    public int totalNQueens(int n) {
        int[][] arr = new int[n][n];
     
        
        return way(arr,0);
    }
}