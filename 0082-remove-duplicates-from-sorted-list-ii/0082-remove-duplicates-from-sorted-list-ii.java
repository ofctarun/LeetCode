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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)return head;  
        ListNode prev = null;
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        while(temp1!=null && temp2!=null){
            if(temp1.val!=temp2.val){
                prev=temp1;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else{
                while(temp2!=null && temp2.val==temp1.val){
                    temp2=temp2.next;
                }
                if(prev==null)head=temp2;
                else prev.next=temp2;
                temp1=temp2;  
                temp2=temp1!=null?temp1.next:null; 
            }
        }
        return head;
    }
}