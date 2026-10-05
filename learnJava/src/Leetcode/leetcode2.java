 package Leetcode;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class leetcode2 {
    public static void main(String[] args) {
        ListNode
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x1= l1.val;
        int x2=l2.val;
        int base=10;

        while(l1.next!=null){
            int y=l1.next.val;
            y=y*base;
            base*=10;
            x1+=y;
            l1=l1.next;
        }

        while(l2.next!=null){
            int y=l2.next.val;
            y=y*base;
            base*=10;
            x2+=y;
            l2=l2.next;
        }
        
        return new ListNode(x1+x2);
    }
}