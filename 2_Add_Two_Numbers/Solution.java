/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        int added = 0;

        while(true){
            int a = (l1 == null ? 0 : l1.val);
            int b = (l2 == null ? 0 : l2.val);

            int sum = (a + b + result.val);
            result.val = sum % 10;

            try{
                l1 = (l1.next == null ? null : l1.next);
            }catch(Exception e){
                l1 = null;
            }

            try{
                l2 = (l2.next == null ? null : l2.next);
            }catch(Exception e){
                l2 = null;
            }
            
            if(l1 == null && l2 == null){
                if(sum / 10 == 1){
                    result.next = new ListNode(sum/10);
                    result = result.next;
                }
                break;
            }
            result.next = new ListNode(sum/10);
            result = result.next;
        }

        return head;
    }
}
