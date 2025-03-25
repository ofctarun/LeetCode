class Solution {
    int c=0;
    public int dfs(int[][] grid,int row,int col,int zero){
        if(row<0||row==grid.length||col==grid[0].length||col<0||grid[row][col]==-1)return 0;
        if(grid[row][col]==2)return (zero==-1)?1:0;
        grid[row][col]=-1;
        zero--;
        int total = dfs(grid,row+1,col,zero)
                    +dfs(grid,row,col+1,zero)
                    +dfs(grid,row-1,col,zero)
                    +dfs(grid,row,col-1,zero);
        grid[row][col]=0;
        zero++;
        return total;
    }
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int zero = 0,row=0,col=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    row = i;
                    col = j;
                }
                else if(grid[i][j]==0)zero++;
            }
        }
        return dfs(grid,row,col,zero);
    }
}