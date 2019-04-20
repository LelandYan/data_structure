package data_structure_java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int[] a = new int[10000001];
        a[1] = a[2] = 1;
        int n  = new Scanner(System.in).nextInt();
        for (int i = 3; i <= n ; i++) {
            a[i] = (a[i-1] + a[i-2])%10007;
        }
        System.out.println(a[n]);
    }
}
