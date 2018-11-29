

import java.util.List;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class Solution {
    private class Freq implements Comparable<Freq>{
        public int e,freq;
        public Freq(int e,int freq){
            this.e = e;
            this.freq = freq;
        }
        @Override
        public int compareTo(Freq another) {
            return this.freq - another.freq;
        }
    }
    public List<Integer> topKFrequent(int[] nums, int k) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int num:nums) {
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a,b) -> map.get(a) - map.get(b)
        );
        for (int key:map.keySet()) {
            if(pq.size() < k)pq.add(key);
            else if(map.get(key) > map.get(pq.peek())){
                pq.remove();
                pq.add(key);
            }
        }
        LinkedList<Integer> res = new LinkedList<>();
        while (!pq.isEmpty()){
            res.add(pq.remove());
        }
        return res;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums1) {
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num) + 1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums2) {
            if(map.containsKey(num)){
                arr.add(num);
                map.put(num,map.get(num) - 1);
                if(map.get(num)==0)map.remove(num);
            }
        }
        int[] res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] dict = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        TreeSet<String> set = new TreeSet<>();
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                res.append(dict[word.charAt(i) - 'a']);
            }
            set.add(res.toString());
        }
        return set.size();
    }

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
