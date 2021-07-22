package LeetCode_Questions;

public class ReverseLinkedList {

        private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(4);
//        head.next.next.next.next.next = new ListNode(4);
//        head.next.next.next.next.next.next = new ListNode(5);

        ListNode baba = head;
        while (baba != null){
            System.out.print(baba.val + " ");
            baba = baba.next;
        }

        System.out.println();

        head = reverse(head);

        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    private static ListNode reverse(ListNode head) {
            ListNode curr = null;
            ListNode temp;
            while (head != null) {
                temp = head;
                head = head.next;
                temp.next = curr;
                curr = temp;
            }

            return curr;
    }
}
