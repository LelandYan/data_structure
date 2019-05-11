package practice;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] t = new int[200005];
        int[] g = new int[200005];
        int n;
        int[] a = new int[105];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            a[i] = sc.nextInt();
            g[a[i]] = 1;
        }
        for(int i =1; i<n;i++){
            for(int j = i+1; j<=n;j++){
                t[a[i]+a[j]]++;
            }
        }
        int ans = 0;
        for(int i = 1; i <= 200002;i++){
            if(t[i]>0&&g[i]!=0)ans++;
        }
        System.out.println(ans);
    }
}
