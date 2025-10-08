class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];
        Arrays.sort(potions);
        for(int k = 0; k < n; k++){
            int i = 0,j = m - 1;
            while(i<=j){
                int mid = i + ((j - i) / 2);
                long pair = (long) spells[k] * potions[mid];
                if(pair >= success){
                    j = mid - 1;
                }else{
                    i = mid + 1;
                }
            }
            ans[k] = m - i;
        }
        return ans;
    }
}