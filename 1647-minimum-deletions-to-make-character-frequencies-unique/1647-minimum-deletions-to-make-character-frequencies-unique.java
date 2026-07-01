class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray())arr[ch - 'a']++;
        int ans = 0;
        HashSet<Integer> used = new HashSet<>();
        for(int freq : arr){
            while(freq > 0  && used.contains(freq)){
                freq--;
                ans++;
            }
            if(freq > 0)used.add(freq);
        }
        return ans;
    }
}