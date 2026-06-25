class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for(String str : strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            hm.putIfAbsent(sorted, new ArrayList<>());
            hm.get(sorted).add(str);
        }
        List<List<String>> ans = new ArrayList<>();
        for(var key : hm.keySet())ans.add(hm.get(key));
        return ans;
    }
}