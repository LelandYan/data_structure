package data_structure_java;

public class Sum {
    public static int sum(int[] arr){
        return sum(arr,0);
    }
    //计算arr[0,n)的和
    private static int sum(int[] arr,int l){
        if(l == arr.length)return 0;
        return arr[l] + sum(arr,l+1);
    }
}
