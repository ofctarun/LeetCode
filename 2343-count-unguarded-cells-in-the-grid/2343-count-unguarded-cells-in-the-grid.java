class Solution{
    public int countUnguarded(int R,int C,int[][] P,int[][] B){
        int[][] M=new int[R][C];
        for(int[] t:B)M[t[0]][t[1]]=2;
        for(int[] t:P)M[t[0]][t[1]]=3;
        for(int[] t:P){
            int x=t[0],y=t[1];
            for(int a=x+1;a<R;a++){if(M[a][y]==2||M[a][y]==3)break;M[a][y]=1;}
            for(int a=x-1;a>=0;a--){if(M[a][y]==2||M[a][y]==3)break;M[a][y]=1;}
            for(int b=y+1;b<C;b++){if(M[x][b]==2||M[x][b]==3)break;M[x][b]=1;}
            for(int b=y-1;b>=0;b--){if(M[x][b]==2||M[x][b]==3)break;M[x][b]=1;}
        }
        int res=0;
        for(int i=0;i<R;i++){
            int[] row=M[i];
            for(int j=0;j<C;j++)if(row[j]==0)res++;
        }
        return res;
    }
}
