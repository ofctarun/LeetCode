class Solution {
public:
    int minOperations(string s) {
        int c = 0, n = s.size();
        for(int i = 0;i < n; i++) {
            if(s[i] != (char)(i % 2 + '0') ){
                c++;
            }
        }
        return min(c,n - c);
    }
};