class Solution {
    static class Pair{
        int r;
        int c;

        Pair(int r, int c){
            this.r=r;
            this.c=c;
        }
    }
    int rows, cols;
    int[] rDir={1,-1,0,0};
    int[] cDir={0,0,-1,1};

    public int numIslands(char[][] grid) {
        rows=grid.length;
        cols=grid[0].length;

        boolean[][] vis=new boolean[rows][cols];
        int ans=0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    bfs(i,j,grid,vis);
                    ans++;
                }
            }
        }    
        return ans;
    }
    void bfs(int row, int col, char[][] grid, boolean[][] vis){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        vis[row][col]=true;

        while(!q.isEmpty()){
            Pair temp=q.poll();
            int tempRow=temp.r;
            int tempCol=temp.c;

            for(int i=0; i<4; i++){
                int nR=tempRow+rDir[i];
                int nC=tempCol+cDir[i];

                if(isValid(nR,nC) && grid[nR][nC] == '1' && vis[nR][nC]==false){
                    q.add(new Pair(nR,nC));
                    vis[nR][nC]=true;
                }
            }
        }
    }
    boolean isValid(int r, int c){
        return r>=0 && r<rows && c>=0 && c<cols;
    }
}