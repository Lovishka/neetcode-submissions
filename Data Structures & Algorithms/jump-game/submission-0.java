class Solution {
    public boolean canJump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(0,nums,dp);
    }
    boolean helper(int idx,int[] nums,int[] dp){
        if(idx>=nums.length-1)return true;
        if(dp[idx]!=-1)return dp[idx]==1;

        for(int jump=1;jump<=nums[idx];jump++){
            if(helper(jump+idx,nums,dp)){
                dp[jump+idx]=1;
                return true;
            }
        }
                dp[idx]=0;
                return false;
            
        }

    
}
