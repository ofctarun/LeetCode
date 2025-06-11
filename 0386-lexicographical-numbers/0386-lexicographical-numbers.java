class Solution {
    public List<Integer> lexicalOrder(int n) {
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.toString(i+1);
        }
        Arrays.sort(arr);
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(Integer.parseInt(arr[i]));
        }
        return ans;
    }
}