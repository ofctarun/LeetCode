class Solution {
    int intersect(int[] a,int[] b){
        HashSet<Integer> A = new HashSet<>();  
        for(int x : a)A.add(x);  
        HashSet<Integer> B = new HashSet<>();  
        for(int x : b){  
            if(A.contains(x))B.add(x);  
        }
        return B.size();
    }
    void dfs(int idx,int[][] properties,int k,boolean[] vis){  
        vis[idx] = true;  
        for(int i = 0;i<properties.length;i++){  
            if(i!=idx && !vis[i] && intersect(properties[idx],properties[i])>=k){
                dfs(i,properties,k,vis);  
            }  
        }  
    }  
    public int numberOfComponents(int[][] properties, int k) {
        int n = properties.length,ans = 0;    
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                ans++;
                dfs(i,properties,k,vis);
            }
        }
        return ans;
    }
}