class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String,Integer> hm=new HashMap<>();
        for(int i=0;i<words.length;i++)hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        char ch[]=s.toCharArray();
        int res=0;
        for(String curr:hm.keySet()){
            int i=0,j=0;
            char ch1[]=curr.toCharArray();
            while(i<ch.length&&j<ch1.length){
                if(ch[i]==ch1[j])j++;
                i++;
            }
            if(j==ch1.length)res+=hm.get(curr);
        }
        return res;
    }
}