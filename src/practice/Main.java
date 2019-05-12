package practice;

import java.util.*;

public class Main {
	private static  char[] mod = new char[] {
	 '0','1','2','3','4','5','6','7','8','9','X'
	};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        char[] num = value.toCharArray();
        int j = 1,t=0;
        for(int i = 0; i < num.length-1;i++) {
        	if(num[i]=='-')continue;
        	else {
        		t+=(num[i]-'0')*j++;
        	}
        }
        if(mod[t%11]==num[12]) {
        	System.out.println("Right");
        }else {
        	num[12]=mod[t%11];
        	System.out.println(String.valueOf(num));
        }
        
    }
}
