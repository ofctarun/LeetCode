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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)return null;
        int size = 0,idx=0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size/2;
        temp = head;
        for(int i=0;i<m-1;i++) {  
            temp = temp.next;  
        }  
        temp.next = temp.next.next;
        return head; 
    }
}