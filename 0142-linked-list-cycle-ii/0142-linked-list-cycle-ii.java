/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode l = head, r = head;
        while(r != null && r.next != null){
            l = l.next;
            r = r.next.next;
            if(l == r){
                ListNode temp = head;
                while(temp != r){
                    temp = temp.next;
                    r = r.next;
                }
                return temp;
            }
        }
        return null;
    }
}