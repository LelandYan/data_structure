import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static double testHeap(Integer[] testData, boolean isHeapify) {
        long startTime = System.nanoTime();
        MaxHeap<Integer> maxHeap;
        if (isHeapify) {
            maxHeap = new MaxHeap<>(testData);
        } else {
            maxHeap = new MaxHeap<>();
            for (int num : testData) {
                maxHeap.add(num);
            }
        }

        int[] arr = new int[testData.length];
        for (int i = 0; i < testData.length; i++) {
            arr[i] = maxHeap.extraceMax();
        }
        for (int i = 1; i < testData.length; i++) {
            if (arr[i - 1] < arr[i]) throw new IllegalArgumentException("Error");
        }
        System.out.println("Test MaxHeap completed");
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    private static double testSet(Set<String> set, String filename) {
        long startTime = System.nanoTime();
        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile(filename, words)) {
            System.out.println("Total words: " + words.size());
            for (String word : words) {
                set.add(word);
            }
            System.out.println("Total different words: " + set.getSize());
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        Integer[] nums = {-2, 0, 3, -5, 2, -1};
        SegmentTree<Integer> segTree = new SegmentTree<>(nums, (a, b) -> a + b);
        System.out.println(segTree.query(0, 2));
//        int n = 10000000;
//        Random random = new Random();
//        Integer[] testData = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            testData[i] = random.nextInt(Integer.MAX_VALUE);
//        }
//        double time1 = testHeap(testData,false);
//        System.out.println("Without heapify: " + time1 + " s");
//        double time2 = testHeap(testData,true);
//        System.out.println("With heapify: " + time2 + " s");
//        MaxHeap<Integer> maxHeap = new MaxHeap<>();
//        Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            maxHeap.add(random.nextInt());
//        }
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = maxHeap.extraceMax();
//        }
//        for (int i = 1; i < n; i++) {
//            if(arr[i-1] < arr[i])throw new IllegalArgumentException("Error");
//        }
//        System.out.println("end");
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
//        System.out.println("Pride and Prejudice");
//        ArrayList<String> words1 = new ArrayList<>();
//        FileOperation.readFile("pride-and-prejudice.txt",words1);
//        System.out.println("Total words: " + words1.size());
//
//        BSTSet<String> set1 = new BSTSet<>();
//        for (String word:words1) {
//            set1.add(word);
//        }
//        System.out.println("Total different words: " + set1.getSize());
    }
}
