class Solution {
    boolean isBalanced(HashMap<Character,Integer> hm){
        if(hm.size() == 0)return true;
        int count = -1;
        for(int value : hm.values()){
            if(count == -1) count = value;
            else if(count != value) return false;
        }
        return true;
    }
    public int longestBalanced(String s) {
        int ans = 0;
        for(int i = 0;i < s.length();i++){
            HashMap<Character, Integer> hm = new HashMap<>();
            for(int j = i;j < s.length();j++){
                char c = s.charAt(j);
                hm.put(c, hm.getOrDefault(c, 0) + 1);
                if(isBalanced(hm)) ans = Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}
