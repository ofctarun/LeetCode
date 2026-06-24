class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] freq = new int[n][n];
        for(int[] query : queries){
            for(int k = query[0]; k <= query[2]; k++){
                freq[k][query[1]] += 1;
                if(query[3] + 1 < n)freq[k][query[3]+1] -= 1;
            }
        }
        for(int k=0;k<n;k++){
            for(int l=1;l<n;l++)freq[k][l] += freq[k][l-1];
        }
        return freq;
    }
}