class Solution {
    public boolean isPalindromic(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            int a = s.charAt(i);
            int b = s.charAt(j);
            int reversed = Integer.reverse(b) >>> 24;
            if (a != reversed)return false;
            i++;
            j--;
        }
        return true;
    }
}