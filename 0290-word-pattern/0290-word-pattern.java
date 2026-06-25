class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length)return false;
        HashMap<Character, String> cToW = new HashMap<>();
        HashMap<String, Character> wToC = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(cToW.containsKey(ch)){
                if (!cToW.get(ch).equals(word))return false;
            }else cToW.put(ch, word);
            if(wToC.containsKey(word)){
                if(wToC.get(word) != ch)return false;
            }else wToC.put(word, ch);
        }
        return true;
    }
}