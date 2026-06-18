class Solution {
    public int longestPalindromeSubseq(String s) {
       Integer[][] dp=new Integer[s.length()][s.length()];
       return solve(s,0,s.length()-1,dp);
    }
   int solve(String s,int left,int right,Integer[][] dp){
    if(left==right)return 1;
    if(left>right)return 0;
    if(dp[left][right]!=null)return dp[left][right];

    if(s.charAt(left)==s.charAt(right)){
        return dp[left][right]=2+solve(s,left+1,right-1,dp);

    }
    return dp[left][right]=Math.max(solve(s,left+1,right,dp), solve(s,left,right-1,dp));
   
    }
}