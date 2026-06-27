class Solution {
    public int passwordStrength(String password) {
        boolean[] vis = new boolean[128];
        String spl = "!@#$";
        int ans = 0;
        for(char ch : password.toCharArray()){
            if(!vis[ch]){
                vis[ch] = true;
                if(ch >= 'a' && ch <= 'z')ans++;
                else if(ch >= 'A' && ch <= 'Z')ans += 2;
                else if(ch >= '0' && ch<= '9')ans += 3;
                else if(spl.contains(ch + ""))ans += 5;
            }
        }
        return ans;
    }
}