import java.util.ArrayList;
import java.util.Arrays;

public class Dijkstra {
    public static void main(String[] args) {
        String data = "6 9 1 2 1 1 3 12 2 3 9 2 4 3 3 5 5 4 3 4 4 5 13 4 6 15 5 6 4";
        ArrayList<Integer> datas = new ArrayList<>();
        for (String s:data.split(" ")) {
            datas.add(Integer.valueOf(s));
        }

        int n = datas.get(0);//顶点数
        int m = datas.get(1);//边数

        int inf = 999999;
        int min = 999999;
        int[][] e = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j)e[i][j] = 0;
                else e[i][j] = inf;
            }
        }
        for (int i = 2; i < datas.size(); i+=3) {
            e[datas.get(i)-1][datas.get(i+1)-1] = datas.get(i+2);
        }
        System.out.println("----------邻接矩阵-----------");
        for (int i = 0; i < n; i++) {
            System.out.println(i+1+"  "+ Arrays.toString(e[i]));
        }
        int begin = 0;
        int[] dis = e[begin];
        System.out.println("----------初始化dis数组-------");
        System.out.println(Arrays.toString(dis));
        //book 1表示确定值，0表示估计值
        int[] book = new int[n];
        //记录最短路径
        String[] path = new String[n];
        for (int i = 0; i < n; i++) {
            book[i] = 0;
            path[i] = (begin+1) + "--->" + (i+1);
        }
        book[begin] = 1;
        int u = 0;
        for (int i = 0; i < n-1; i++) {
            min = inf;
            for (int j = 0; j < n; j++) {
                if(book[j] == 0 && dis[j] < min){
                    min = dis[j];
                    u = j;
                }
            }
            book[u] = 1;
            for (int j = 0; j < n; j++) {
                if(e[u][j] < inf && dis[j] > dis[u]+e[u][j]){
                    dis[j] = dis[u]+e[u][j];
                    path[j] = path[u] + "---->" + (j+1);
                }
            }
        }
        System.out.println("---------------以"+(begin+1)+"为起点的图的最短路径为-------------------");
        System.out.println(Arrays.toString(dis));
        System.out.println("");
        for(int i=0;i<n;i++){
            System.out.println(path[i]+"  =  "+dis[i]);
        }
    }
}
