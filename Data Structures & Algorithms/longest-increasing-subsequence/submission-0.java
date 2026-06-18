class Solution {
    public int lengthOfLIS(int[] nums) {
        Integer[][] dp=new Integer[nums.length][nums.length+1];
        //curr,prev
       return lis(0,-1,nums,dp);
    }
    int lis(int idx,int prev,int[] nums,Integer[][] dp){
        if(idx>=nums.length)return 0;
        if(dp[idx][prev+1]!=null)return dp[idx][prev+1];

        int notpick=lis(idx+1,prev,nums,dp);
        int pick=Integer.MIN_VALUE;

        if(prev==-1 || nums[prev]<nums[idx]){
           pick= 1+lis(idx+1,idx,nums,dp);
        }
        return dp[idx][prev+1]=Math.max(pick,notpick);
    }
}
