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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> lists = new HashSet();
        for(int i:nums){
            lists.add(i);
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(head!=null){
            if(!lists.contains(head.val)){
                current.next=new ListNode(head.val);
                current=current.next;
            }
            head=head.next;
        }
        return dummy.next;
    }
}