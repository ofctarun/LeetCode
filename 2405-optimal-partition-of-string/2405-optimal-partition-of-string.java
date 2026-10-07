class Solution {
    public int partitionString(String s) {
        boolean[] seen = new boolean[26];
        int c = 1;
        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            if(seen[idx]){
                c++;
                seen = new boolean[26];
            }
            seen[idx] = true;
        }
        return c;
    }
}