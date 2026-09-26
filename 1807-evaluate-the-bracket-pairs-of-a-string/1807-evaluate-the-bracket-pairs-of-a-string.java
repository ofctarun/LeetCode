class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> hm = new HashMap<>();
        for(List<String> ls : knowledge)hm.put(ls.get(0), ls.get(1));
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        boolean inside = false;
        for(char c : s.toCharArray()){
            if(c == '('){
                inside = true;
                sb = new StringBuilder();
            }else if (c == ')'){
                inside = false;
                String key = sb.toString();
                ans.append(hm.getOrDefault(key, "?"));
            }else if(inside){
                sb.append(c);
            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}