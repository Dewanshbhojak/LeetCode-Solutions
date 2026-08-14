class Solution {
    public static int way(int[][] arr, int row, int col,int[][] dp) {
        if (row == arr.length - 1 && col == arr[0].length - 1) {
            if (arr[row][col] <= 0) {
                return Math.abs(arr[row][col]) + 1;
            } else {
                return 1;
            }

        }

        if (row >= arr.length || col >= arr[0].length)
            return Integer.MAX_VALUE;
    if(dp[row][col]!=Integer.MAX_VALUE) return dp[row][col];
        int left = way(arr, row + 1, col,dp) ;
        int down = way(arr, row, col + 1,dp);
        if(Math.min(left, down) <= arr[row][col]) return 1;
        return   dp[row][col] = Math.min(left, down) - arr[row][col];
    }

    public int calculateMinimumHP(int[][] arr) {
        int[][] dp = new int[arr.length][arr[0].length] ;
        for(int[] dp1 : dp) {
            Arrays.fill(dp1,Integer.MAX_VALUE);
        }
        return way(arr, 0, 0,dp);
    }
}