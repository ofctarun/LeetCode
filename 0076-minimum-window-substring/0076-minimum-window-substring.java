class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length())return "";
        char[] req = new char[128];
        char[] win = new char[128];
        for(char ch : t.toCharArray())req[ch]++;
        int i = 0,match = 0,min = Integer.MAX_VALUE,start = -1;
        for(int j = 0; j < s.length(); j++){
            char curr = s.charAt(j);
            win[curr]++;
            if(win[curr] <= req[curr])match++;
            while(match == t.length()){
                if(j - i + 1 < min){
                    min = j - i + 1;
                    start = i;
                }
                char left = s.charAt(i);
                if(win[left] == req[left])match--;
                win[left]--;
                i++;
            }
        }
        return start == -1 ? "" : s.substring(start,start + min);
    }
}