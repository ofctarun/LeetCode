class Solution {
    private String ans = "";  
    
    public void generate(int n, String str, HashSet<String> lst) {  
        if (!ans.isEmpty()) return;  
        if (str.length() == n) {  
            if (!lst.contains(str)) {
                ans = str;  
            }  
            return;  
        }  
        generate(n, str + "0", lst);  
        generate(n, str + "1", lst);  
    }  
    
    public String findDifferentBinaryString(String[] nums) {  
        HashSet<String> lst = new HashSet<>();  
        for (String st : nums) lst.add(st);  
        generate(nums[0].length(), "", lst);  
        return ans;  
    }  
}