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
        ListNode ptr,cptr,temp;
        if(head==null){
                return null;
            }
            ptr=head.next;
            cptr=head;
            temp=cptr;
            
               while(ptr!=null){
                head=ptr;
                ptr=head.next;
                head.next=cptr;
                cptr=head;
                
               }
              temp.next=null;
               return head;
    }
}