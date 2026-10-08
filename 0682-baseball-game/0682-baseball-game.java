class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(String op : operations){
            if(op.equals("C"))ans -= st.pop(); 
            else if(op.equals("D")){
                int doubled = st.peek() * 2;
                ans += doubled;
                st.push(doubled);
            }
            else if(op.equals("+")){
                int curr = st.peek() + st.get(st.size() - 2); 
                ans += curr;
                st.push(curr);
            }
            else{
                int curr = Integer.parseInt(op);
                ans += curr;
                st.push(curr);
            }
        }
        return ans;
    }
}
