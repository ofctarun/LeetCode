class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] freq = new int[101];
        for(int[] yr : logs){
            freq[yr[0]-1950]++;
            freq[yr[1]-1950]--;
        }
        int c = 0,yr = 0;
        for(int i=0;i<101;i++){
            if(i>0)freq[i] += freq[i-1];
            if(freq[i] > c){
                c = freq[i];
                yr = i + 1950;
            }
        }
        return yr;
    }
}