class Solution {
    public boolean isPalindromic(String s) {
        int i = 0, j = s.length() - 1;
        while(i <= j){
            String a = String.format("%8s",Integer.toBinaryString(s.charAt(i))).replace(' ', '0');
            String b = String.format("%8s",Integer.toBinaryString(s.charAt(j))).replace(' ', '0');
            int k = 0, l = 7;
            while(k < 8 && l > 0){
                if(a.charAt(k) != b.charAt(l))return false;
                k++;
                l--;
            }
            i++;
            j--;
        }
        return true;
    }
}