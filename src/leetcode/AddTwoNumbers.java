package leetcode;

public class AddTwoNumbers {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static class Solution {
        private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode p = l1, q = l2, curr = dummyHead;
            int carry = 0;

            while (p != null || q != null) {
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (p != null) p = p.next;
                if (q != null) q = q.next;
            }

            if (carry > 0) {
                curr.next = new ListNode(carry);
            }

            return dummyHead.next;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();

            // Example usage:
            // Construct linked lists representing 342 and 465
            ListNode l1 = new ListNode(2);
            l1.next = new ListNode(4);
            l1.next.next = new ListNode(3);

            ListNode l2 = new ListNode(5);
            l2.next = new ListNode(6);
            l2.next.next = new ListNode(4);

            // Add the numbers and print the result
            ListNode result = solution.addTwoNumbers(l1, l2);
            while (result != null) {
                System.out.print(result.val + " ");
                result = result.next;
            }
            // Output: 7 0 8 (342 + 465 = 807)
        }
    }
}