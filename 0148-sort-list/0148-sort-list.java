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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        int c=0;
        while(temp!=null){
            temp = temp.next;
            c++;
        }
        int idx=0;temp=head;
        int[] arr = new int[c];
        while(temp!=null){
            arr[idx++]=temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        int i=0;
        temp = head;
        while(temp!=null){
            temp.val=arr[i];
            temp=temp.next;
            i++;
        }
        return head;
    }
}