
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0){
            return arr;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        int rank=1;
        int[] temp = arr.clone();
        Arrays.sort(temp);
        hm.put(temp[0],rank++);
        for(int i=1;i<temp.length;i++){
            if(temp[i]==temp[i-1]){
                continue;
            }
            else{
                hm.put(temp[i],rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}
