class Solution {
    public int dfs(int start , int end ,int[][]dp){
        if(start>end) return 1;
        if(dp[start][end]!=-1) return dp[start][end];
        int res = 0;
          for(int i =start;i<=end;i++) {
            res+=dfs(start,i-1,dp)*dfs(i+1,end,dp);
          } 
          return dp[start][end]=res; 
    }
    
    public int numTrees(int n) {
            int[][] dp = new int[n+1][n+1];
            for(int[] arr:dp)
            Arrays.fill(arr,-1);
            return dfs(1,n,dp);
    }
}