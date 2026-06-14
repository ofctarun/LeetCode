/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int n=0;
        while(temp!= null){ 
            n++;
            temp = temp.next;
        }
        int [] arr =new int[n];
        temp = head;
        int i=0;
        while(temp!= null){
            arr[i]  = temp.val;
            temp = temp.next;
            i++;
        }
        int ans = Integer.MIN_VALUE;
        for(i=0;i<n/2;i++){
            int sum =arr[i]+arr[n-i-1]; 
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}