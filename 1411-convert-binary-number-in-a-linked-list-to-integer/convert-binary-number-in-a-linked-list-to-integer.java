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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head.next!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
        arr.add(head.val);
        int siz = arr.size();
        int i=0;
        double sum=0;
        int k=siz-1;
        while(i<siz)
        {
            int n=arr.get(i);
            sum=sum+((Math.pow(2,k))*n);
            i++;
            k--;
        }
        return (int)sum;
    }
}