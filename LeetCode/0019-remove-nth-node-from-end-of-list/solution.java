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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null){
            return null;
        }
        
        int size=findSize(head,0);
        ListNode deleteNode=findNode(head,size-n);
        if(deleteNode==head){
            head=head.next;
            
        }
        delete(head,deleteNode);
        return head;
    }
        public static int findSize(ListNode head,int size){
            ListNode current=head;
            while(current!=null){
                size++;
                current=current.next;
            }
            return size;
        }
        public static ListNode findNode(ListNode head,int index){
            int count=0;
            ListNode current=head;
            while(current!=null){
                if(count==index){
                    return current;
                }
                count++;
                current=current.next;
            }
            return head;
        }
        public static void delete(ListNode head,ListNode node){
            ListNode current=head.next;
            ListNode prev=head;
            while(current!=null){
                if(current==node){
                    prev.next=current.next;
                    return;
                }
                prev=current;
                current=current.next;
            }
            
        }
}
