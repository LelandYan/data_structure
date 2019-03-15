package src;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class the_max_total_of_series {
	public static int MaxSubsequSum1(int[] A,int N) {
		int ThisSum,MaxSum = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i; j < N; j++) {
				ThisSum=0;
				for(int k = i; k <= j; k++) {
					ThisSum += A[k];
				}
				if(MaxSum < ThisSum)MaxSum = ThisSum;
			}
		}
		return MaxSum;
	}
	public static int MaxSubsequSum2(int[] A,int N) {
		int ThisSum,MaxSum = 0;
		for(int i = 0; i < N; i++) {
			ThisSum=0;
			for(int j = i; j < N; j++) {
				ThisSum += A[j];
				if(MaxSum < ThisSum)MaxSum = ThisSum;
			}
		}
		return MaxSum;
	}
	//分而治之
	public static int MaxSubsequSum3(int[] A,int N) {
		int ThisSum,MaxSum = 0;
		for(int i = 0; i < N; i++) {
			ThisSum=0;
			for(int j = i; j < N; j++) {
				ThisSum += A[j];
				if(MaxSum < ThisSum)MaxSum = ThisSum;
			}
		}
		return MaxSum;
	}
	//在线处理
	public static int MaxSubsequSum4(int[] A,int N) {
		int ThisSum=0,MaxSum=0;
		for(int i = 0; i < N; i++) {
			ThisSum += A[i];
			if(MaxSum < ThisSum)MaxSum = ThisSum;
			else if(ThisSum < 0) ThisSum = 0;
		}
		return MaxSum;
	}
	public static String random_op() {
		int n = (int)(Math.random()*4);
		if(n==0)return "+";
		if(n==1)return "-";
		if(n==2)return "*";
		return "/";
	}
	public static void shuffle(String[] x) {
		for(int i = 0; i < x.length; i++) {
			int j = (int)(Math.random() * x.length);
			String t = x[i];
			x[i] = x[j];
			x[j] = t;
		}
	}
	public static boolean operatation(String[] data) {
		Stack stk = new Stack();
		try {
			for(int i = 0; i < data.length; i++) {
				if(data[i].equals("+") || data[i].equals("-") ||data[i].equals("*") ||data[i].equals("/")) {
					int a = Integer.parseInt((String) stk.pop());
					int b = Integer.parseInt((String) stk.pop());
					stk.push(op(a,b,data[i]) + "");
				}else {
					stk.push(data[i]);
				}
			}
		}
		catch(Exception e) {return false;}
		if(stk.size() == 1 && stk.pop().equals("24"))return true;
		else return false;
	}
	public static int op(int a,int b,String operator) throws Exception {
		if(operator.equals("+"))return a+b;
		if(operator.equals("-"))return a-b;
		if(operator.equals("*"))return a*b;
		if(a%b!=0)throw new Exception("not /");
		return a / b;
	}
	public static void show(String[] data) {
		System.out.println("ok");
	}
	public static void f(String[] ss) {
		
		
		for(int k=0; k <10000;k++) {
			String[] buf = new String[7];
			for(int i = 0; i < 4; i++)buf[i] = ss[i];
			for(int i = 4; i < 7; i++)buf[i] =random_op();
			shuffle(buf);
			
			if(operatation(buf)) {
				show(buf);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4];
		for(int i = 0; i < 4; i++) {
			a[i] = i;
		}
//		System.out.println(Arrays.toString(a));
//		int sum = MaxSubsequSum1(a,4);
//		System.out.println(sum);
//		System.out.println(Math.pow(2, 16));
		
		// 30人的班级，出现生日的重复概率有多大？
		final int N  = 1000 * 1000;
		int n = 0;
		for(int i =0; i < N;i++) {
			int[] x = new int[365];
			for(int j = 0; j < 30;j++) {
				int  p = (int)(Math.random() * 365);
				if(x[p] == 1) {
					n++;break;
				}else {
					x[p]=1;
				}
			}
		}
//		System.out.println((double)n / N);
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("请输入4个正数： ");
			String[] ss = scan.nextLine().split(" +");
		}
		
	}

}
