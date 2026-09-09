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

 class SLL{
    ListNode head;
    ListNode current;
    public void insert(int val){
        ListNode newNode=new ListNode(val,null);
        if(head==null){
            head=newNode;
            return;
        }
        current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
 }
class Solution {
    static int k;
    static int arr[];
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int m=findSize(list1,0);
        int n=findSize(list2,0);
        arr=new int[m+n];
        k=0;
       inserted(list1);
       inserted(list2);
       Arrays.sort(arr);
       SLL list=new SLL();
       for(int i:arr){
        list.insert(i);
       }
      return Lhead(list);
    }
    public static int findSize(ListNode list,int size){
        ListNode current=list;
        while(current!=null){
            size++;
            current=current.next;
        }
        return size;
    }
    public static void inserted(ListNode list){
        ListNode current=list;
        while(current!=null){
            arr[k++]=current.val;
            current=current.next;
        }
    }
    public static ListNode Lhead(SLL list){
       return list.head;
    }
}
