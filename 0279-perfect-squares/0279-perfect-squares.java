class Solution {
    public int dfs(int[] arr, int target,int[]dp){
        if(target == 0){
            return 0;
        }
        if(target<0) return Integer.MAX_VALUE;
        if(dp[target]!=-1) return dp[target];
        int res = Integer.MAX_VALUE;
        for(int i = 1;i<arr.length;i++) {
            res = Math.min(res,dfs(arr,target-arr[i],dp));
        }
        if(res == Integer.MAX_VALUE) return 0;
        return dp[target] = res+1;
    }
    public int numSquares(int n) {
        int size =(int) Math.pow(n,0.5) + 1;
        int [] arr = new int[size];
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        for(int i = 0;i<size;i++) {
            arr[i] = i*i;
        }
        return dfs(arr,n,dp);
    }
}