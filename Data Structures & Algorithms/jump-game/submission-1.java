class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp=new boolean[nums.length];
       dp[nums.length-1]=true;
       for(int idx=nums.length-2;idx>=0;idx--){
        for(int jump=1;jump<=nums[idx] && jump<nums.length;jump++){
            if(dp[jump+idx]){
                dp[idx]=true;
                break;
            }
        }
       }
        return dp[0];
       
    }
  

    
}
