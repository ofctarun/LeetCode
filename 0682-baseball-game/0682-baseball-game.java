class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String  op : operations){
            if(op.equals("C"))st.pop();
            else if(op.equals("D"))st.push(st.peek() * 2);
            else if(op.equals("+"))st.push(st.peek() + st.get(st.size() - 2));
            else st.push(Integer.valueOf(op));
        }
        int ans = 0;
        for(int el : st)ans += el;
        return ans;
    }
}