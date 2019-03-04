import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;
public class small_number {
    public static void main(String[] args) {
        // 浮点数的比较 不能简单的使用 ==
//        System.out.println(Math.abs(0.2 + 0.1 - 0.3) < 1e-10);
//        //定义任意精度的小数
//        BigDecimal a = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(6),
//                new MathContext(100));
//        System.out.println(a);


        // 有关的java的输入问题
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);

    }
}
