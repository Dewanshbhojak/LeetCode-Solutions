class Solution {
    public static int way(int[][] arr, int i, int j ,int prev,int[][] dp) {
        if(prev>=arr[i][j]) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int down = 0;
        int left = 0;
        int right = 0;
        int top = 0;
        if(i-1>=0) {
            top= way(arr,i-1,j,arr[i][j],dp);
        }
        if(i+1< arr.length) {
           down = way(arr,i+1,j,arr[i][j],dp);
        }
        if(j+1< arr[i].length) {
            right = way(arr,i,j+1,arr[i][j],dp);
        }
        if(j-1 >=0) {
            left = way(arr,i,j-1,arr[i][j],dp);
        }

        return dp[i][j] =  1+Math.max(top,Math.max(down,Math.max(left,right)));
    }
    public int longestIncreasingPath(int[][] arr) {
        int max = 0;
        int[][] dp = new int[arr.length][arr[0].length];
        for(int []a:dp) {
            Arrays.fill(a,-1);
        }
        for(int i = 0;i<arr.length;i++) {
            int maxi = 0;
            for(int j = 0;j<arr[i].length;j++) {
                maxi = Math.max(maxi,way(arr,i,j,-1,dp));
            }
            max = Math.max(max,maxi);
        }
        if(max == 1) {
            return 1;
        }
        return max-1;
    }
}