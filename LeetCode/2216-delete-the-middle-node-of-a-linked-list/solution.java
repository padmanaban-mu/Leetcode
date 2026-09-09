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
    public ListNode deleteMiddle(ListNode head) {
       ListNode middle=findMiddle(head);
       head=deleteNode(head,middle);
       return head;
    }
    public static ListNode findMiddle(ListNode head){
    
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode deleteNode(ListNode head,ListNode node){
        ListNode current=head;
        ListNode prev=null;
        while(current!=null && current!=node){
            prev=current;
            current=current.next;
        }
        if(current==null){
            return head;
        }
        if(prev==null){
            head=head.next;
        }
        else{
            prev.next=current.next;
        }
        return head;
    }
}
