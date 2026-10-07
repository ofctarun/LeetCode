class Solution {
    public int partitionString(String s) {
        int[] seen = new int[26];
        int c = 1;
        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            if (seen[idx] == 1) {
                c++;
                seen = new int[26];
            }
            seen[idx] = 1;
        }
        return c;
    }
}