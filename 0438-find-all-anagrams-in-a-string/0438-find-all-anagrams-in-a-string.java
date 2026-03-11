class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ct = 0;
        int f[] = new int[26];
        List<Integer> al = new ArrayList<>();
        for(char c : p.toCharArray()){
            int x = c - 'a';
            if(f[x] == 0) ct++;
            f[x]--;
        }
        int l = 0, r = 0;
        while(r < s.length()){
            int in = s.charAt(r) - 'a';
            if(f[in] == 0) ct++;
            f[in]++;
            if(f[in] == 0) ct--;
            if(r - l + 1 < p.length())r++;
            else{
                if(ct == 0) al.add(l);
                int ou = s.charAt(l) - 'a';
                if(f[ou] == 0) ct++;
                f[ou]--;
                if(f[ou] == 0) ct--;
                l++;
                r++;
            }
        }
        return al;
    }
}