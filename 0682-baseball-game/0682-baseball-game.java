class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(String ch:operations){
            if(ch.equals("C")){
                sum=sum-stack.pop(); 
            }
            else if(ch.equals("D")){
                sum+=2*stack.peek();
                stack.push(2*stack.peek());
            }
            else if(ch.equals("+")){
                int a=stack.pop();
                int b=stack.peek();
                sum+=(a+b);
                stack.push(a);
                stack.push(a+b);
            }
            else{
                stack.push(Integer.valueOf(ch));
                sum+=Integer.valueOf(ch);
            }
        }
        return sum;
    }
}