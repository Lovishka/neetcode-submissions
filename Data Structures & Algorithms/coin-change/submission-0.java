class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[][] dp=new Integer[coins.length][amount+1];
        int ans= solve(coins.length-1,coins,amount,dp);
        return ans>=(int)1e9?-1:ans;
    }
    int solve(int idx,int[] coins,int target,Integer[][] dp){
        if(idx==0){
            if(target%coins[0]==0)return target/coins[0];
            return (int)1e9;
        }
        if(dp[idx][target]!=null)return dp[idx][target];

        int notpick=solve(idx-1,coins,target,dp);
        int pick=(int)1e9;
        if(coins[idx]<=target){
            pick=1+solve(idx,coins,target-coins[idx],dp);
        }
        return dp[idx][target]=Math.min(pick,notpick);
    }
}
