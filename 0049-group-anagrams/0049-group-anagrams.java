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
        return new ArrayList<>(hm.values());
    }
}