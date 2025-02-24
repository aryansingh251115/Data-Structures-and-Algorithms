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

 //done by my self but chatgpt approach is best(given below)
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

/*
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head; // No rotation needed
        }

        // Step 1: Find length of the linked list
        int length = 1; // Start with 1 since we are already at head
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: Optimize k
        k = k % length;
        if (k == 0) return head; // No rotation needed

        // Step 3: Find the new tail (length - k - 1 steps from start)
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        // Step 4: Update pointers
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head; // Connect last node to the original head

        return newHead;
    }
}
*/