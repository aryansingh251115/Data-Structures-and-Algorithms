/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int length = len(head);
        
        if (head == null || k == 0) {
            return head;
        }
        if(k>length){
            k = k % length;
        }
        while (k > 0) {
            head = rotate(head);
            k--;
        }
        return head;
    }

    public int len(ListNode head) {
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        return len;
    }

    public ListNode rotate(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }
        ListNode prev = null;
        ListNode temp = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        temp.next = head;
        return temp;
    }
}