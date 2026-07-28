class Solution {
    public int countHomogenous(String s) {
        int i = 0;
        long res = 0;
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(i) == s.charAt(j))res += j - i + 1;
            else{
                res += 1;
                i = j;
            }
        }
        return (int)(res % (1000000007));       
    }
}