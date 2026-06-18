class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] dp=new Integer[m][n];
        return solve(0,0,m,n,dp);
    }
    int solve(int i,int j,int m,int n,Integer[][] dp){
        if(i==m-1 || j==n-1)return 1;
        if(dp[i][j]!=null)return dp[i][j];

        return dp[i][j]=solve(i+1,j,m,n,dp)+solve(i,j+1,m,n,dp);
    }
}
