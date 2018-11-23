import java.util.List;
import java.util.Stack;

public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
//            ListNode delNode = head;
//            head = head.next;
//            delNode.next = null;
            head = head.next;
        }
        if (head == null) return head;
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
//                ListNode delNode = prev.next;
//                prev.next = delNode.next;
//                delNode.next = null;
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(c == '(' || c == '{' || c == '[')stack.push(c);
//            else{
//                if(stack.isEmpty())return false;
//                char topChar = stack.pop();
//                if(c == ')' && topChar != '(')return false;
//                if(c == ']' && topChar != '[')return false;
//                if(c == '}' && topChar != '{')return false;
//            }
//        }
//        return stack.isEmpty();
//    }
}
