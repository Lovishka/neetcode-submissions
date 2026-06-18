class Solution {
    public int minDistance(String word1, String word2) {
        Integer[][] dp=new Integer[word1.length()][word2.length()];
        return solve(word1,word2,word1.length()-1,word2.length()-1,dp);

    }
    int solve(String s1, String s2, int i, int j, Integer[][] dp){
        if(i<0)return j+1;
        if(j<0)return i+1;

        if(dp[i][j]!=null)return dp[i][j];

        if(s1.charAt(i)==s2.charAt(j))return dp[i][j]=solve(s1,s2,i-1,j-1,dp);
        int a=solve(s1,s2,i-1,j,dp);
        int b=solve(s1,s2,i,j-1,dp);
        int c=solve(s1,s2,i-1,j-1,dp);
        return dp[i][j]=1+Math.min(a,Math.min(b,c));

    }
}
