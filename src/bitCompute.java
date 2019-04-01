import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bitCompute {
    public static void main(String[] args) {
//        int N = 1001;
//        int[] arr = new int[N];
//        for (int i = 0; i < arr.length - 1; i++) {
//            arr[i] = i + 1;
//        }
//        arr[arr.length - 1] = new Random().nextInt(N - 1) + 1;
//        int index = new Random().nextInt(N);
//        swap(arr,index,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        int x = 0;
//        for(int i = 1; i <= N-1; i++){
//            x = x^i;
//        }
//        for(int i = 0; i < N; i++){
//            x = x^arr[i];
//        }
//        System.out.println(x);
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int cnt = 0;
//        System.out.println(Integer.toString(x,2));
//        for (int i = 0; i < 32; i++) {
//            if (((x >>> i) & 1) == 1) {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);


//        int s = 65;
//        if(((s-1)&s)==0) System.out.println("ok");
//        else System.out.println("not");
    }

    private static void swap(int[] num, int x, int y) {
        int z = num[x];
        num[x] = num[y];
        num[y] = z;
    }

    private static void swap2(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }
}
