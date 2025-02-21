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
    public ListNode swapNodes(ListNode head, int k) {
        int len = length(head);
        ListNode first = head;
        for(int i =1;i<k;i++){
            first = first.next; //stores the first kth value.
        }
        ListNode last = head;
        for(int i = k;i<len;i++){
            last = last.next;
        }

        int temp = first.val;
        first.val = last.val;
        last.val  =temp;
    return head;
    }

    public int length(ListNode head){
        ListNode curr = head;
        int k = 0;
        while(curr != null){
            k++;
            curr = curr.next;
        }
    return k;
    }
}