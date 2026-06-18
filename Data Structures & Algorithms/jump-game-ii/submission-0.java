class Solution {
    public int jump(int[] nums) {
     Integer[] dp=new Integer[nums.length];   
     return helper(0,nums,dp);
    }
    int helper(int idx,int[] nums,Integer[] dp){
        if(idx>=nums.length-1)return 0;
        if(dp[idx]!=null)return dp[idx];

        int min=(int)1e9;

        for(int jumps=1;jumps<=nums[idx];jumps++){
            min=Math.min(min,1+helper(jumps+idx,nums,dp));
        }
        return dp[idx]=min;
    }
}
