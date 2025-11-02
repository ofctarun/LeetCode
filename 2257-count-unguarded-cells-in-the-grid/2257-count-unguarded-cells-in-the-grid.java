class Solution{
    public int countUnguarded(int r,int c,int[][] G,int[][] W){
        int[][] A=new int[r][c];
        for(int[] p:W)A[p[0]][p[1]]=-1;
        for(int[] p:G)A[p[0]][p[1]]=1;
        int[] D={0,1,0,-1,0};
        for(int[] p:G){
            int x=p[0],y=p[1];
            for(int d=0;d<4;d++){
                int i=x+D[d],j=y+D[d+1];
                while(i>=0&&i<r&&j>=0&&j<c){
                    int v=A[i][j];
                    if(v==-1||v==1)break;
                    if(v==0)A[i][j]=2;
                    i+=D[d];
                    j+=D[d+1];
                }
            }
        }
        int z=0;
        for(int i=0;i<r;i++){
            int[] Q=A[i];
            for(int j=0;j<c;j++)if(Q[j]==0)z++;
        }
        return z;
    }
}
