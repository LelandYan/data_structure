
public class for_recursion {
    public static void f(int n) {
        if (n > 0) f(n - 1);
        System.out.println(n);
    }

    public static int f2(int[] a, int begin) {
        if (begin >= a.length) return 0;
        return f2(a, begin + 1) + a[begin];
    }

    public static int f3(int[] a, int end) {
        if (end < 0) return 0;
        return f3(a, end - 1) + a[end];
    }

    public static int f4(int[] a, int begin, int end) {
        if (begin == end) return a[begin];
        int mid = (begin + end) / 2;
        return f4(a, begin, mid) + f4(a, mid + 1, end);

    }

    public static boolean isSameString(String a, String b) {
        return a.equals(b);
    }

    public static boolean f6(String a, String b) {
        if (a.length() != b.length()) return false;
        if (a.length() == 0) return true;
        if (a.charAt(0) != b.charAt(0)) return false;
        return f6(a.substring(1), b.substring(1));
    }

    public static int c(int n, int m) {
        if (n < m) return 0;
        if (n == m) return 1;
        if (m == 0) return 1;
        return c(n - 1, m - 1) + c(n - 1, m);
    }

    public static void a(char[] data, int k) {
        if (k == data.length - 1) {
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
        for (int i = k; i < data.length; i++) {
            {
                char t = data[k];
                data[k] = data[i];
                data[i] = t;
            } // 试探
            a(data, k + 1);
            {
                char t = data[k];
                data[k] = data[i];
                data[i] = t;
            } // 回溯
        }
    }

    public static int l(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) return 0;
        if (s1.charAt(0) == s2.charAt(0)) return l(s1.substring(1), s2.substring(1)) + 1;
        return Math.max(l(s1.substring(1), s2), l(s1, s2.substring(1)));
    }

    public static String reverse(String s1) {
        if (s1.length() == 1) return s1;
        return reverse(s1.substring(1)) + s1.charAt(0);
    }

    public static int f(int m, int n) {
        if (n == 0) return 1;
        if (m == n) return 1;
        return f(m - 1, n) + f(m - 1, n - 1);
    }

    public static int g(int m, int n) {
        if (m == 0 || n == 0) return 1;
        return g(m - 1, n) + g(m, n - 1);
    }

    public static void p(int n, int[] a, int k) {
        if (n <= 0) {
            for (int i = 0; i < k; i++)
                System.out.print(a[i] + " ");
            System.out.println();
            return;
        }
        for (int i = n; i > 0; i--) {
            if(k > 0 && i > a[k-1])continue ;
            a[k] = i;
            p(n - 1, a, k + 1);
        }
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        f(9);
//        int[] arr = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
//        int sum2 = f2(arr,0);
//        System.out.println(sum2);
//        System.out.println(f3(arr,arr.length-1));
//        System.out.println(f4(arr,0,arr.length-1));
//        System.out.println(isSameString("abc","abc"));
//        String a = "12";
//        System.out.println(a.charAt(1));
//        System.out.println(f6("abc","abc"));

//        char[] data = "ABCDE".toCharArray();
        // 在n个球中，取出m个（不放回），求有多少种不同的取法
//        int k = c(10, 3);
////        System.out.println(k);
//
//        // 求n个元素的全排列
//        char[] data = "ABC".toCharArray();
//        a(data,0);
//
//        // 求两个串的最大公共子序列的长度
//        int w = l("asfgsdgsdgdfcd","xbacskjld");
//        System.out.println(w);
//
//        String a = "abc";
//        System.out.println(a.substring(1));

        // 反字符串
//        String s1 = "abc";
//        System.out.println(reverse(s1));

        // 杨辉三角
//        int lenve = 5;
//        for (int i = 0; i <= lenve; i++) {
//            System.out.print(f(lenve, i) + " ");

//        }
        //m个A，n个B，组成多少排列


        //对n进行加法划分
        int[] a = new int[1000];
        p(6, a, 0);
    }
}
