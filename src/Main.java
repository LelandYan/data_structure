import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
//        ArrayStack<Integer> stack = new ArrayStack<>();
//        for (int i = 0; i < 5; i++) {
//            stack.push(i);
//            System.out.println(stack);
//        }
//        stack.pop();
//        System.out.println(stack);
//        System.out.println(arr);
//        arr.add(1,100);
//        System.out.println(arr);
//        arr.addFirst(-1);
//        System.out.println(arr);
//        arr.remove(2);
//        System.out.println(arr);
//        arr.remvoeElement(2);
//        System.out.println(arr);
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < 5; i++) {
//            linkedList.addFirst(i);
//            System.out.println(linkedList);
//        }
//        linkedList.add(2,66);
//        System.out.println(linkedList);
//        linkedList.remove(2);
//        System.out.println(linkedList);
        System.out.println("Pride and Prejudice");
        ArrayList<String> words1 = new ArrayList<>();
        FileOperation.readFile("pride-and-prejudice.txt",words1);
        System.out.println("Total words: " + words1.size());
    }
}
