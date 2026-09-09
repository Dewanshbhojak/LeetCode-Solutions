class Solution {
    public long way(int[] arr, int target,long[][]dp,int index){
        if (target < 0) return 0;

    if (dp[target][index] != -1)
        return dp[target][index];

    long res = 1; 

    for (int i = index; i < arr.length; i++) {
        res += way(arr, target - arr[i], dp, i);
    }

    return dp[target][index] = res;
    }
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int[] arr = {cost1,cost2};
        long[][] dp = new long[total+1][2];
        for(long[] a: dp){
            Arrays.fill(a,-1);
        }
        return way(arr,total,dp,0); 
    }
}