class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] freq = new int[n][n];
        for(int[] query : queries){
            for(int i = query[0]; i <= query[2]; i++){
                freq[i][query[1]] += 1;
                if(query[3] + 1 < n)freq[i][query[3]+1] -= 1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++)freq[i][j] += freq[i][j-1];
        }
        return freq;
    }
}