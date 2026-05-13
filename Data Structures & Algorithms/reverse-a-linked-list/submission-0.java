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
    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        ListNode nextNode = head;
        while(nextNode != null){
            ListNode temp = nextNode.next;
            nextNode.next = node;
            node = nextNode;
            nextNode = temp;
        }
        head = node;
        return head;
    }
}
