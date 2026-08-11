class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i:nums2){
            while(!st.isEmpty() && st.peek()<i){
                mp.put(st.pop(),i);
            }
            st.push(i);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=mp.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}