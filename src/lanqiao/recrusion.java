package lanqiao;

import data_structure_java.Array;

import java.util.Arrays;

public class recrusion {
    private static int gcd(int m,int n){
        if(n == 0)return m;
        return gcd(n,m%n);
    }
    private static void insertSort(int[] arr,int k){
        if(k==0)return;
        insertSort(arr,k-1);
        int x = arr[k];
        int index = k - 1;
        while(index>-1&&x<arr[index]){
            arr[index+1] = arr[index];
            index--;
        }
        arr[index+1] = x;
    }
    private static void printHano(int N,String from,String to,String helper){
        if(N==1){ System.out.println("move "+N+" from "+from+" to"+from);return;}
        printHano(N-1,from,helper,to);
        System.out.println("move "+N+" from "+from+" to"+from);
        printHano(N-1,helper,to,from);
    }
    private static int BinarySearch1(int[] arr,int low,int high,int key){
        if(low > high)return -1;
        int mid = low + ((high-low)>>1);
        int midVal = arr[mid];
        if(midVal < key){
            return BinarySearch1(arr,mid+1,high,key);
        }else if(midVal > key){
            return BinarySearch1(arr,low,mid-1,key);
        }else{
            return mid;
        }
    }
    private static int floor(int a){
        if(a==0)return 1;
        if(a==1)return 1;
        if(a==2)return 2;
        return floor(a-1)+floor(a-2)+floor(a-3);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int res= BinarySearch1(arr,0,arr.length-1,5);
        System.out.println(res);
//        int[] arr = {5,6,7,2,1,4};
//        System.out.println(Arrays.toString(arr));
//        insertSort(arr,arr.length-1);
//        System.out.println(Arrays.toString(arr));
    }
}
