public class Dijkstra {
    private int[][] e;//定点的各个距离
    private int[] dis;//最短路径
    private int[] book;//是否确定标志
    private int inf;//定义最大值
    private int n;//定点数
    private int m;//边数

    public Dijkstra() {
        e = new int[10][10];
        dis = new int[10];
        book = new int[10];
        inf = 99999999;
        n = 6;
        m = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m ; j++) {
                
            }
        }
    }
}
