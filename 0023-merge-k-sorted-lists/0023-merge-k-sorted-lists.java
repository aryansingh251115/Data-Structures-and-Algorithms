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
    public ListNode mergeKLists(ListNode[] lists) {
        int k  = lists.length;
        if(k == 0){
            return null;
        }
        return divideNConquer(0,k-1,lists);
    }

    private ListNode divideNConquer(int s , int e , ListNode lists[]){
        if(s>e){
            return null;
        }
        if(s == e){
            return lists[s];
        }
        int mid = s + (e-s)/2;
        
        ListNode L1 = divideNConquer(s,mid,lists);
        ListNode L2 = divideNConquer(mid+1,e,lists);

        return sort(L1 ,L2);
    }

    public static ListNode sort(ListNode head1, ListNode head2) {
        ListNode L1 = head1;
        ListNode L2 = head2;
        if(L1 == null) return L2;
        if(L2 == null) return L1;
        if (L1.val <= L2.val) {
            L1.next = sort(L1.next, L2);
            return L1;
        }
        else{
            L2.next = sort(L1, L2.next);
            return L2;
        }
    }
}