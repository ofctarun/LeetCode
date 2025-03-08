class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long s=0,ss=0,n1=grid.length,n=grid.length*grid.length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                s += grid[i][j];
                ss += grid[i][j] * grid[i][j];
            }
        }
        long a = (n*(n+1))/2,b = (n*(n+1)*(2*n+1))/6;
        long x = (((b-ss)/(a-s)) + (a-s))/2;
        long y = x + s - a;
        return new int[]{(int)y,(int)x};
    }
}