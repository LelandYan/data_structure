package practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();//3
        long days = sc.nextInt();//10
        long[] week = new long[7];
        int cnt = 1;
        for(int i=day-1;cnt<=days;i++,cnt++){
            if(i>6){
                i-=7;
            }
            week[i]++;
        }
        long total=0;
        for(int i = 0; i < 7; i++){
            if(i<5){
                total +=(week[i]*250);
            }
        }
        System.out.println(total);
    }
}
