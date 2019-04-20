package lanqiao;

import data_structure_java.Array;

import java.util.*;

public class Bit_Operation {
    private static void swap(int[] arr ,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        // 第一题 选出数组一个重复的元素 (不用辅助空间)
//        int n = 1001;
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length - 1; i++) {
//            arr[i] = i + 1;
//        }
//        arr[arr.length-1] = new Random().nextInt(n-1) + 1;
//        int index = new Random().nextInt(n);
//        swap(arr,index,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        int x1 = 0;
//        for(int i = 1; i <= n - 1; i++){
//            x1 = (x1^i);
//        }
//        for(int i = 0; i < n; i++){
//            x1 = x1^arr[i];
//        }
//        System.out.println(x1);
//        System.out.println();
        // 第一题 解法二
//        int[] helper = new int[n];
//        for(int i = 0; i < n; i++){
//            helper[arr[i]]++;
//        }
//        for(int i = 0; i < n; i++){
//            if(helper[i] == 2){
//                System.out.println(i);
//                break;
//            }
//        }
        // 第二题 找出唯一成对的数

        // 第三题  二进制1的个数
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Integer.toString(a,2));
        int cnt = 0;
        for(int i = 0; i < 32; i++){
            if(((a>>>i)&1) == 1){
                cnt++;
            }
        }
        System.out.println("二进制数1的个数为："+cnt);
    }
}
