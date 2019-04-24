package lanqiao;

import data_structure_java.Array;

import java.util.Arrays;

public class recrusion {
    private static int gcd(int m, int n) {
        if (n == 0) return m;
        return gcd(n, m % n);
    }

    private static void insertSort(int[] arr, int k) {
        if (k == 0) return;
        insertSort(arr, k - 1);
        int x = arr[k];
        int index = k - 1;
        while (index > -1 && x < arr[index]) {
            arr[index + 1] = arr[index];
            index--;
        }
        arr[index + 1] = x;
    }

    private static void printHano(int N, String from, String to, String helper) {
        if (N == 1) {
            System.out.println("move " + N + " from " + from + " to" + to);
            return;
        }
        printHano(N - 1, from, helper, to);
        System.out.println("move " + N + " from " + from + " to" + to);
        printHano(N - 1, helper, to, from);
    }

    private static int BinarySearch1(int[] arr, int low, int high, int key) {
        if (low > high) return -1;
        int mid = low + ((high - low) >> 1);
        int midVal = arr[mid];
        if (midVal < key) {
            return BinarySearch1(arr, mid + 1, high, key);
        } else if (midVal > key) {
            return BinarySearch1(arr, low, mid - 1, key);
        } else {
            return mid;
        }
    }

    private static int floor(int a) {
        if (a == 0) return 1;
        if (a == 1) return 1;
        if (a == 2) return 2;
        return floor(a - 1) + floor(a - 2) + floor(a - 3);
    }

    // 数组中的数字都不相同
    public static int min(int[] arr) {
        int begin = 0;
        int end = arr.length - 1;
        // 考虑没有进行旋转的情况
        if (arr[begin] < arr[end]) return arr[begin];
        while (begin + 1 < end) {
            int mid = begin + ((end - begin) >> 1);
            if (arr[mid] >= arr[begin]) begin = mid;
            else end = mid;
        }
        return arr[end];
    }

    //有空字符串的有序字符串数组的查找
    private static int indexOf(String[] arr, String p) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int indexOfMid = begin + ((end - begin) >> 1);
            while (arr[indexOfMid].equals("")) {
                indexOfMid++;
                if (indexOfMid > end) return -1;
            }
            if (arr[indexOfMid].compareTo(p) > 0) {
                end = indexOfMid - 1;
            } else if (arr[indexOfMid].compareTo(p) < 0) {
                begin = indexOfMid + 1;
            } else {
                return indexOfMid;
            }
        }
        return -1;
    }

    private static int MaxLen(int[] arr) {
        int begin = 1;
        int end = 2;
        int max_len = 0;
        int len = 0;
        while ((end <= arr.length+1) && (begin <= end)) {
            int temp = begin;
            if(end==arr.length+1){
                len = end - begin;
                if(len > max_len)max_len = len;
                break;
            }else {
                while (arr[end - 1] > arr[temp - 1]) {
                    temp++;
                    end++;
                    if (temp == arr.length) {
                        end = arr.length + 1;
                        break;
                    }
                }
                end--;
                len = end - begin + 1;
                if (len > max_len) max_len = len;
                begin = end + 1;
                end = begin + 1;
            }
        }
    return max_len;
    }

    // 求a的n次方（n为非负数）
    private static int pow0(int a,int n){
        if(n==0)return 1;
        int res = a;
        int ex = 1;
        while((ex<<1)<=n){
            res *= res;
            ex<<=1;
        }
        return res*pow0(a,n-ex);
    }
    public static void main(String[] args) {
        System.out.println(pow0(2,11));
//        int[] arr = {1,9,2,5,7,3,4,6,8,9,10};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(MaxLen(arr));
//        System.out.println(MaxLen(arr));
//        String[] arr = {"a","","ac","ad","b","","ba"};
//        int res = indexOf(arr,"abc");
//        System.out.println(res);
//        int[] arr = {5,1,2,3,4};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(min(arr));
//        int[] arr = {1,2,3,4,5,6};
//        int res= BinarySearch1(arr,0,arr.length-1,5);
//        System.out.println(res);
//        int[] arr = {5,6,7,2,1,4};
//        System.out.println(Arrays.toString(arr));
//        insertSort(arr,arr.length-1);
//        System.out.println(Arrays.toString(arr));
    }
}
