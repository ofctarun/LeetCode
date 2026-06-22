class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        int[] idx = {0,1,11,13,14};
        for(char ch : text.toCharArray())freq[ch - 'a']++;
        freq[11] /= 2;freq[14] /= 2;
        int min = freq[0];
        for(int el : idx)min = Math.min(min, freq[el]);
        return min;
    }
}