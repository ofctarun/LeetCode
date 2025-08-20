class Solution {
    int traverse(int[][] matrix,int row,int col){
        int inc = 0;
        boolean pos = true;
        while(pos){
            if(row + inc >= matrix.length || col + inc >= matrix[0].length)break;
            for(int i=row;i<=row+inc;i++){
                for(int j=col;j<=col+inc;j++){
                    if(matrix[i][j] == 0){
                        pos = false;
                        break;
                    }
                }
                if(!pos)break;
            }
            if(pos){
                inc++;
            }
        }
        return inc;
    }
    public int countSquares(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 1){
                    ans +=  traverse(matrix,i,j);
                }
            }
        }
        return ans;   
    }
}