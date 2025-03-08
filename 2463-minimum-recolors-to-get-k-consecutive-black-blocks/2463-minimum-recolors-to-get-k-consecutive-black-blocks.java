class Solution {
    public int minimumRecolors(String blocks, int k) {
        int w=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W')w++;
        }
        if(w==0)return 0;
        int n=blocks.length(),ans=w;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i)=='W')w++;
            if(blocks.charAt(i-k)=='W')w--;
            ans = Math.min(ans,w);
        }
        return ans;
    }
}