class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int[] last = new int[26];
        for(int i=s.length()-1;i>=0;i--){
            if(last[s.charAt(i)-'a'] == 0)last[s.charAt(i)-'a'] = i;
        }
        int idx = 0;
        while(idx < s.length()){
            int lastIdx = last[s.charAt(idx)-'a'],i=idx;
            while(i < lastIdx){
                if(last[s.charAt(i)-'a'] > lastIdx) lastIdx = last[s.charAt(i)-'a'];
                i++; 
            }
            res.add(lastIdx-idx+1);
            idx = lastIdx + 1; 
        }
        return res;
    }
}