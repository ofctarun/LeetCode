class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        int ans = 0;
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
        boolean[] vis = new boolean[10001];
        for(int freq : arr){
            while(freq > 0  && vis[freq]){
                freq--;
                ans++;
            }
            vis[freq] = freq > 0;
        }
        return ans;
    }
}