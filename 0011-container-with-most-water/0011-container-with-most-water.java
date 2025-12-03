class Solution {
    public int maxArea(int[] h) {
        int l = 0,r = h.length - 1,mx = 0;
        while(l < r){
            int mn = h[l]<h[r] ? h[l] : h[r];
            int w = r-l;
            int area = mn*w;
            if(area > mx)mx = area;
            if(h[l]<h[r]) l++;
            else r--;
        }
        return mx;
    }
}
