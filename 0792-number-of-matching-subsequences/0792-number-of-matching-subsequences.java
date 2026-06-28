class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String word : words)hm.put(word, hm.getOrDefault(word, 0) + 1);
        int ans = 0;
        char ch[] = s.toCharArray();
        for(String word : words){
            char curr[] = word.toCharArray();
            int i = 0, j = 0;
            while(i < curr.length && j < ch.length){
                if(word.charAt(i) == s.charAt(j))i++;
                j++;
            }
            if(i == curr.length)ans++;
        }
        return ans;
    }
}