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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head, slow = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            arr.add(slow.val);
            slow = slow.next;
        }
        int i = arr.size()-1;
        if(fast != null){
            slow = slow.next;
        }
        while(slow != null){
            if(arr.get(i) != slow.val){
                return false;
            }
            slow = slow.next;
            i--;
        }
        return true;

    }
}