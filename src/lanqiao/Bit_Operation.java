package lanqiao;

import data_structure_java.Array;

import java.awt.print.PrinterGraphics;
import java.math.MathContext;
import java.util.*;

public class Bit_Operation {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // 第一题 选出数组一个重复的元素 (不用辅助空间)
//        int n = 1001;
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length - 1; i++) {
//            arr[i] = i + 1;
//        }
//        arr[arr.length-1] = new Random().nextInt(n-1) + 1;
//        int index = new Random().nextInt(n);
//        swap(arr,index,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        int x1 = 0;
//        for(int i = 1; i <= n - 1; i++){
//            x1 = (x1^i);
//        }
//        for(int i = 0; i < n; i++){
//            x1 = x1^arr[i];
//        }
//        System.out.println(x1);
//        System.out.println();
        // 第一题 解法二
//        int[] helper = new int[n];
//        for(int i = 0; i < n; i++){
//            helper[arr[i]]++;
//        }
//        for(int i = 0; i < n; i++){
//            if(helper[i] == 2){
//                System.out.println(i);
//                break;
//            }
//        }
        // 第二题 找出唯一成对的数

        // 第三题  二进制1的个数
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(Integer.toString(a,2));
//        int cnt = 0;
//        for(int i = 0; i < 32; i++){
//            if(((a>>>i)&1) == 1){
//                cnt++;
//            }
//        }
//        System.out.println("二进制数1的个数为："+cnt);

        // 第三题  解法二
//        cnt = 0;
//        while(a!=0){
//            a = (a-1)&a;
//            cnt++;
//        }
//        System.out.println("二进制数1的个数为："+cnt);

        // 第四题 是不是2的正数次方
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if(((a-1)&a) == 0){
//            System.out.println("ok");
//        }else{
//            System.out.println("no");
//        }

        // 第五题 将正数的奇偶位互换
//        int a = 9;
//        int b = m(9);
//        System.out.println(b);
        // 第六题  0-1间的浮点数的二进制数
//        double m = 0.3;
//        StringBuilder sb = new StringBuilder("0.");
//        while (m>0){
//            double r = m * 2;
//            if(m >=1){
//                sb.append("1");
//                m = r-1;
//            }else{
//                sb.append("0");
//            }
//            if(sb.length() > 34){
//                System.out.println("ERROR");
//                return;
//            }
//        }
//        System.out.println(sb.toString());

        //第七题  出现k次与出现1次
        int[] arr = {2, 2, 2, 9, 7, 7, 7, 3, 3, 3, 6, 6, 6, 0, 0, 0};
        int len = arr.length;
        char[][] kRadix = new char[len][];
        int k = 3;

        int maxlen = 0;
        for(int i = 0; i < len;i++){
            kRadix[i] = new StringBuilder(Integer.toString(arr[i],k)).reverse().toString().toCharArray();
            if(kRadix[i].length > maxlen){
                maxlen = kRadix[i].length;
            }
        }
        int[] resArr = new int[maxlen];
        for(int i = 0; i <len; i++){
            for(int j = 0; j < maxlen; j++){
                if(j >= kRadix[i].length){
                    resArr[j] += 0;
                }else{
                    resArr[j] += (kRadix[i][j] - '0');
                }
            }
        }
        int res = 0;
        for(int i = 0; i < maxlen; i++){
            res += ((resArr[i] % k) * (int)(Math.pow(k,i)));
        }
        System.out.println(res);
    }

    private static int m(int i) {
        int ou = i & 0xaaaaaaaa;
        int ji = i & 0x55555555;
        return (ou >> 1) ^ (ji << 1);
    }


}
