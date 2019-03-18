package src;
import java.math.BigInteger;
import java.util.Scanner;
import java.io.*;
public class solution_pratice {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
		//闰年时间计算
//		System.out.println(31+29+31+4+30);
		
		// 方格计算
//		int R = 1000;
//		int a = 1000;
//		int b=0;
//		int tb=b;
//		int count = 0;
//		for(a = 1000; a>=0; a--) {
//			while((a*a+b*b)<=(R*R))b++;
//			b--;
//			count+=a*(b-tb);
//			tb = b;
//		}
//		System.out.println(count*4);
		
		//复数幂
		PrintStream ps = new PrintStream(new FileOutputStream("work.txt"));
		System.setOut(ps);
		int n = 123456;
		BigInteger a = new BigInteger("2");
		BigInteger b = new BigInteger("3");
		BigInteger a1 = new BigInteger("2");
		BigInteger b1 = new BigInteger("3");
		for(int i = 1; i < n; i++) {
			BigInteger ta = a;
			a = a.multiply(a1).subtract(b.multiply(b1));
			b = ta.multiply(b1).add(b.multiply(a1));
		}
		System.out.println(a+(b.compareTo(BigInteger.ZERO)>0?"+":"")+b+"i");

	}
}
