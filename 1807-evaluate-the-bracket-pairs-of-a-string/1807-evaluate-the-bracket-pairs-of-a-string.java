class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> hm = new HashMap<>();
        for(List<String> ls : knowledge){
            hm.put(ls.get(0),ls.get(1));
        }
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < s.length()){
            if(s.charAt(i) != '(' && s.charAt(i) != ')')sb.append(s.charAt(i));
            else{
                i++;
                StringBuilder str = new StringBuilder();
                while(s.charAt(i) != ')'){
                    str.append(s.charAt(i));
                    i++;
                }
                String strr = new String(str);
                if(!hm.containsKey(strr))sb.append('?');
                else sb.append(hm.get(strr));
            }
            i++;
        }
        return new String(sb);
    }
}