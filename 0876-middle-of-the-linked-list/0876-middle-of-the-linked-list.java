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
    public ListNode middleNode(ListNode head) {
        ListNode tmp = head;
        int len = 0;
        while(tmp != null) {
            len++;
            tmp = tmp.next;
        }
        tmp = head;
        if(len % 2 == 0) {
            for(int i = 0; i < len/2; i++) {
                tmp = tmp.next;
            }
        } else {
            for(int i = 0; i < (len-1)/2; i++) {
                tmp = tmp.next;
            }
        }
        return tmp;
    }
}