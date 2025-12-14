
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public static void main(String[] args) {
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        int l1result=0;
        int l2result=0;

        while(l1!=null || l2!=null)
        {
            l1result+=l1.val;
            l2result+=l2.val;
            l1=l1.next;
            l2=l2.next;
        }

        return result;
    }
}