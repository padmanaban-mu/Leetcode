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
    public ListNode removeElements(ListNode head, int val) {
        int n=findS(head,0,val);
        for(int i=0;i<n;i++){
        ListNode current=head;
        ListNode prev=null;
        while(current!=null && current.val!=val){
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
        }
        return head;
    }
    public static int findS(ListNode head,int count,int val){
       ListNode current=head;
        while(current!=null){
            if(current.val==val){
                count++;
            }
            current=current.next;
        }
        return count;
    }
}
