class Solution {
    boolean isAnagram(String a,String b){
        if(a.length() != b.length())return false;
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i < words.length){
            int j = i + 1;
            while(j < words.length && isAnagram(words[i],words[j])){
                j++;
            }
            ans.add(words[i]);
            i = j;
        }

        return ans;
    }
}