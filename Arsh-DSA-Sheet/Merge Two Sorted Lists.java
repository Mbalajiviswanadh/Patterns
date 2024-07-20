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

    static class ListNode{

        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 != null && list2 != null){
            if(list1.val < list2.val){
                list1.next= mergeTwoLists(list1.next, list2);
                list1=list1.next;
            }
            else{
                list2.next=mergeTwoLists(list1, list2.next);
                list2=list2.next;
            }
        }

        if(list1 != null)
        return list1;
        else
        return list2;
    }
}