class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        int ct = 0;
        vector<int>f(26, 0);
        vector<int>al;
        for(char c : p){
            int x = c - 'a';
            if(f[x] == 0)ct++;
            f[x]--;
        }
        int l = 0, r = 0;
        int n = s.length();
        int m = p.length();
        while(r < n){
            int in = s[r] - 'a';
            if (f[in] == 0) ct++;
            f[in]++;
            if (f[in] == 0) ct--;
            if (r - l + 1 < m)r++;
            else{
                if(ct == 0) al.push_back(l);
                int ou = s[l] - 'a';
                if(f[ou] == 0) ct++;
                f[ou]--;
                if(f[ou] == 0) ct--;
                l++;
                r++;
            }
        }
        return al;
    }
};