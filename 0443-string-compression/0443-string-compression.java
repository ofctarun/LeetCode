class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;
        int i = 0;
        while (i < n) {
            char currentChar = chars[i];
            int j = i;
            while (j < n && chars[j] == currentChar) {
                j++;
            }
            int count = j - i;
            chars[index++] = currentChar;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
            i = j;
        }
        return index;      
    }
}