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
                String str = "";
                while(s.charAt(i) != ')'){
                    str += s.charAt(i);
                    i++;
                }
                if(!hm.containsKey(str))sb.append('?');
                else sb.append(hm.get(str));
            }
            i++;
        }
        return new String(sb);
    }
}