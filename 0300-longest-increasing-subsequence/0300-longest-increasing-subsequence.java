class Solution {
    public static int way(int[] arr,int n ,int prev ,int[][]dp) {
         if (n == arr.length )
            return 0;
        if(dp[n][prev+1]!=-1) return dp[n][prev+1];
        int take = 0;
        int skip = 0;
        if(prev==-1|| arr[prev]<arr[n])
        take = 1+ way(arr, n + 1, n,dp);
         skip = way(arr, n + 1, prev,dp);
      return dp[n][prev+1]= Math.max(take,skip);
    }

    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1];
        for(int[]arr : dp)
        Arrays.fill(arr,-1);
        return way(nums, 0, -1,dp);
    }
}