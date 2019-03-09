import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class bracket_test {
	public static String f(String s1) {
		if(s1.length() == 1)return s1;
		return f(s1.substring(1)) + s1.charAt(0);
	}
	public static int f(int m,int n) {
		if(n == 0)return 1;
		if(m == n)return 1;
		return f(m-1,n) + f(m-1,n-1);
	}
	public static int g(int m, int n) {
		if(n == 0 || m == 0)return 1;
		return g(m-1,n) + g(n,m-1);
	}
	public static int a(int m,int n) {
		if(n == 0)return 1;
		if(m == 0)return 0;
		if(m == n)return 1;
		return f(m-1,n-1) + f(m-1,n);
	}
	public static void b(int n,int[] a,int k) {
		if(n <= 0) {
			for(int i =0; i < k; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			return;
		}
		for(int i = n; i>0; i--) {
			if(k > 0 && i > a[k-1])continue;
			a[k] = i;
			b(n-i,a,k+1);
		}
		
	}
	public static int gcd(int a,int b) {
		if(a == 0)return b;
		return gcd(b%a,a);
	}
	public static void main(String[] args) {
		// 从m个数中取出n个数，能形成多少个组合
//		System.out.println(a(5,3));
		
		// m个数能够形成多少种排列组合问题 ?
//		char[] arr1 = "123".toCharArray();
//		BigDecimal a = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(6),new MathContext(100));
//		System.out.println(a);
		// 加法分解
//		int[] arr2 = new int[1000];
//		b(6,arr2,0);
		
		
		//字符串反转问题
//		String s1 = "abcd";
//		System.out.println(f(s1));
		
		//杨辉三角
//		int level = 5;
//		for(int i = 0 ; i <= level;i++) {
//			System.out.print(f(level,i) + " ");
//		}
		
		
		
		// 括号匹配问题
//		Scanner sc = new Scanner(System.in);
//		String line = sc.nextLine();
//		//自动进行排序
//		TreeMap<Integer,Integer> res = new TreeMap<Integer, Integer>();
//		Stack<Integer> stack = new Stack<Integer>();
//		//开始解析字符串的每个字符
//		for(int i = 0; i < line.length(); i++) {
//			char c = line.charAt(i);
//			//左括号入栈
//			if(c == '(') {
//				stack.push(i+1);
//			}else {
//				Integer pop = stack.pop();
//				res.put(pop, i+1); 
//			}
//		}
//		for(Map.Entry<Integer, Integer> entry: res.entrySet()) {
//			System.out.println(entry.getKey() + " "  + entry.getValue());
//		}
		
		
		//数字问题
//		for(int i = 100; i < 1000; i++) {
//			if(String.valueOf(i * i).endsWith(i+""))System.out.println(i+" "+i*i);
//		}
		
		
		//约瑟夫循环问题
//		Vector a = new Vector();
//		for(int i = 1; i <= 10; i++) {
//			a.add("第"+i+"个孩子");
//		}
//		for(;;) {
//			if(a.size() == 1)break;
//			for(int k = 0; k < 2; k++) {
//				a.add(a.remove(0));
//			}
//			a.remove(0);
//		}
//		System.out.println(a);
		
		//最大公因数
//		int a = 15;
//		int b = 40;
//		for(int i = 15; i>=1; i--) {
//			if(a%i==0 && b%i==0){System.out.println(i);
//			break;}
//		}
		//辗转相除法
//		int c = 15;
//		int d = 40;
//		// 递归实现
//		System.out.println(gcd(15,40));
//		// 循环实现
//		for(;;) {
//			int t = c;
//			c = d%c;
//			d = t;
//			if(c==0) {System.out.println(d);break;}
//		}
//		
//		//最小公倍数 a * b / gcd(a,b)
//		System.out.println(a*b/gcd(a,b));
		
		//求第n个素数 --- 使用筛选法
		int N = 1000 * 1000 * 10;
		int x = 3;
		
		byte[] a = new byte[N];
		for(int i = 2; i< N/2; i++) {
			if(a[i] == 1)continue;
			for(int k =2; k < N/i;k++) {
				if(i*k<N)a[i*k] = 1;
			}
		}
		int m = 0;
		for(int i=2; i < N; i++) {
			if(a[i] == 0) {
				m++;
				if(m==x)System.out.println(i + " ");
			}
		}
	}
}
