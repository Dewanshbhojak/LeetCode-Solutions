class Solution {
    public static boolean way(int[] arr , int jump , int n,int prev,Boolean[][]dp) {
        if(prev+jump!=arr[n]) return false;
        if(n==arr.length-1)return true;
        if(n>=arr.length) return false;
        if(dp[n][jump]!=null) return dp[n][jump];
        for(int i = n+1;i< arr.length;i++) {
            if(way(arr,jump+1,i,arr[n],dp)){
                return dp[n][jump]=true;
            }
            if(way(arr,jump-1,i,arr[n],dp) && jump!=1){
                return dp[n][jump]= true;
            }
             if(way(arr,jump,i,arr[n],dp)){
                return dp[n][jump]=true;
            }
        }
        return dp[n][jump]=false;
    }
    public boolean canCross(int[] stones) {
        Boolean[][] dp = new Boolean[stones.length+1][];
        int i = 0;
        for(;i<dp.length;i++){
            dp[i] = new Boolean[i+1];
        }
        return way(stones,1,1,stones[0],dp);
    }
}