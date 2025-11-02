class Solution {
    void Traverse(int[][] grid, int i, int j, int dx, int dy){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == -1 || grid[i][j] == 1)return;
        grid[i][j] = 2;
        Traverse(grid,i+dx,j+dy,dx,dy);
    }

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int grid[][] = new int[m][n];
        int ans = 0;
        for(int[] guard : guards){
            grid[guard[0]][guard[1]] = 1;
        }
        for(int[] wall : walls){
            grid[wall[0]][wall[1]] = -1;
        }
        int[] dir = {0, 1, 0, -1, 0};
        for (int[] guard : guards) {
            int x = guard[0], y = guard[1];
            for (int k = 0; k < 4; k++) {
                Traverse(grid, x+dir[k], y+dir[k+1], dir[k], dir[k+1]);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 0)ans++;
            }
        }
        return ans;
    }
}