class Solution {
    public int countHomogenous(String s) {
        int i = 0;
        long ans = 0;
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(i) == s.charAt(j))ans += j - i + 1;
            else{
                ans++;
                i = j;
            }
        }
        return (int)(ans % (1000000007));       
    }
}