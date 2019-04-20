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
    public static void main(String[] args) {
        int[] arr = {5,6,7,2,1,4};
        System.out.println(Arrays.toString(arr));
        insertSort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
