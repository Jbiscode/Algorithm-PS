import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  static List<Edge> graph;
  static int totalCosts;
  static int[] parent;

  static class Edge{
    private int x,y,z;

    public Edge(int x, int y, int z) {
      this.x = x;
      this.y = y;
      this.z = z;
    }
  }
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    while (true) {
      graph = new ArrayList<>();
      st = new StringTokenizer(br.readLine());
      totalCosts = 0;

      int M = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());
      if (M == 0 && N == 0) {
        break;
      }

      for (int i = 0; i < N; i++) {
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        graph.add(new Edge(x, y, z));
        totalCosts += z;
      }

      graph.sort(Comparator.comparingInt((Edge e) -> e.z));

      parent = new int[M];
      for (int i = 0; i < M; i++) {
        parent[i] = i;
      }

      int mstCost = 0;
      int selectedCnt = 0;

      for (Edge edge : graph) {
        if (selectedCnt == M-1) {
          break;
        }

        if (find(edge.x) != find(edge.y)) {
          union(edge.x, edge.y);
          mstCost += edge.z;
          selectedCnt++;
        }
      }

      sb.append(totalCosts - mstCost).append("\n");

    }

    bw.write(sb.toString());
    bw.flush();

  }

  static int find(int x){
    if (parent[x] != x) {
      parent[x] = find(parent[x]);
    }
    return parent[x];
  }

  static void union(int a, int b){
    int rootA = find(a);
    int rootB = find(b);
    if (rootA != rootB) {
      parent[rootA] = rootB;
    }
  }
}