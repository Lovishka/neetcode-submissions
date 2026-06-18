class Solution {
    int[] dr={-1,1,0,0};
    int[] dc={0,0,-1,1};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int[][] visited=new int[n][m];
        int start=image[sr][sc];

        for(int i=sr;i<n;i++){
            for(int j=sc;j<m;j++){
                if(visited[i][j]==0 && image[i][j]==start){
                    dfs(i,j,sr,sc,color,image,visited);
                }
            }
        }
        return image;
    }
    void dfs(int r,int c,int sr,int sc,int color,int[][] image,int[][] visited){
        int n=image.length;
        int m=image[0].length;

        if(r<0 || c<0 || r>=n || c>=m || image[r][c]!=image[sr][sc] || visited[r][c]==1)return;

        visited[r][c]=1;

        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];

            dfs(nr,nc,sr,sc,color,image,visited);
        }
        image[r][c]=color;
    }
}