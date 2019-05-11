package practice;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int child;
        int n = 0;
        int mother = 0;
        int left = 0;
        int cnt = 0;
        boolean flag = false;
        while(cnt!=12){
            child = sc.nextInt();
            left = 300 - child + left;
            if(left < 0) {
                flag = true;
                break;
            }
            else if(left>=100){
                n = ((left/100)*100);
                left-=n;
                mother+=n;
            }
            cnt++;
        }
        if(flag)System.out.println("-"+(cnt+1));
        else System.out.println(mother*12/10+left);
    }
}
