class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = 0,n = cardPoints.length - 1;
        for(int i = 0; i < k; i++)max += cardPoints[i];
        int ans = max;
        for(int i = k - 1,j = n; i >= 0;j--,i--){
            max += cardPoints[j] - cardPoints[i];
            System.out.println("n - i : " +  cardPoints[n - i] +" i : " + cardPoints[i]);
            ans = (ans > max) ? ans : max;
        }
        return ans;
    }
}