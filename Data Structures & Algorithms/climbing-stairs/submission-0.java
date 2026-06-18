class Solution {
    public int climbStairs(int n) {
    Integer[] dp=new Integer[n+1];
      return solve(n,dp);  
    }
    int solve(int idx,Integer[] dp){
        if(idx==0)return 1;
        if(idx<0)return 0;
         
         if(dp[idx]!=null)return dp[idx];
         return dp[idx]=solve(idx-1,dp)+solve(idx-2,dp);
    }
}
