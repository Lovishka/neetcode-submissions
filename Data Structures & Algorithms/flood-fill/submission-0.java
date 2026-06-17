class Solution {
    static int[] dr={-1,1,0,0};
    static int[] dc={0,0,-1,1};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int original=image[sr][sc];

        int[][] visited=new int[n][m];

        for(int i=sr;i<n;i++){
            for(int j=sc;j<m;j++){
                if(visited[i][j]==0 && image[i][j]==original){
                    dfs(i,j,image,color,sr,sc,visited);
                }
            }
        }
        return image;
    }
    void dfs(int r,int c,int[][] image,int color,int sr,int sc,int[][] visited){
         int n=image.length;
        int m=image[0].length;
        if(r<0 || c<0 || r>=n || c>=m || image[r][c]!=image[sr][sc] || visited[r][c]==1){
            return;
        }
        visited[r][c]=1;
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            dfs(nr,nc,image,color,sr,sc,visited);
        }
        image[r][c]=color;
    }
}