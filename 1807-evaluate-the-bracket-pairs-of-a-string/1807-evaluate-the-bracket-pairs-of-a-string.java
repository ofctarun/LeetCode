class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for(List<String> pair : knowledge)map.put(pair.get(0), pair.get(1));
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '('){
                ans.append(s.charAt(i));
                continue;
            }
            i++;
            StringBuilder str = new StringBuilder();
            while(s.charAt(i) != ')'){
                str.append(s.charAt(i));
                i++;
            }
            ans.append(map.getOrDefault(str.toString(), "?"));
        }
        return ans.toString();
    }
}