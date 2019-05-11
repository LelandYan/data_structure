package practice;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int need = sc.nextInt();
        int[] arr = new int[6];
        int cnt = 0;
        int n,m;
        int minValue=Integer.MAX_VALUE;
        while(cnt != 6){
            arr[cnt++] = sc.nextInt();
            arr[cnt++] = sc.nextInt();
        }
        for(int i = 0; i < 6; i+=2){
            n = need/arr[i];
            if((need-n*arr[i])!=0)n+=1;
            m = n*arr[i+1];
            if(m<minValue)minValue=m;
        }
        System.out.println(minValue);
    }
}
