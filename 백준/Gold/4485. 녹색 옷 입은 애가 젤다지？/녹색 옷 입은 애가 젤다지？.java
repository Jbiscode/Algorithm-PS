import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  static StringBuilder sb;
  static int N;
  static int[][] grid, dist;
  static int[] dr = {-1, 0, 1, 0};
  static int[] dc = { 0, 1, 0,-1};
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    sb = new StringBuilder();
    StringTokenizer st;

    int tc = 1;
    String line;
    while (!(line = br.readLine()).equals("0")) {
      N = Integer.parseInt(line);
      grid = new int[N][N];
      dist = new int[N][N];
      for (int i = 0; i < N; i++) {
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < N; j++) {
          grid[i][j] = Integer.parseInt(st.nextToken());
          dist[i][j] = Integer.MAX_VALUE;
        }
      }

      int answer = dijkstra();
      
      sb.append("Problem ").append(tc++).append(": ").append(answer).append("\n");
    }



    bw.write(sb.toString());
    bw.flush();
  }
  private static int dijkstra() {
    PriorityQueue<Node> pq = new PriorityQueue<>();
    dist[0][0] = grid[0][0];

    pq.offer(new Node(0, 0, grid[0][0]));

    while (!pq.isEmpty()) {
      Node node = pq.poll();
      int r = node.r;
      int c = node.c;
      int cost = node.cost;

      if(r == N-1 && c == N-1) return cost;

      if (dist[r][c] < cost) continue;

      for (int i = 0; i < 4; i++) {
        int nr = r + dr[i];
        int nc = c + dc[i];

        if (nr < 0 || nc < 0 || nr > N-1 || nc > N-1) continue;

        int nCost = cost + grid[nr][nc];
        if (nCost < dist[nr][nc]) {
          dist[nr][nc] = nCost;
          pq.offer(new Node(nr,nc,dist[nr][nc]));
        }
      }

    }
    return -1;
  }
}

class Node implements Comparable<Node>{
  int r;
  int c;
  int cost;

  public Node(int r, int c, int cost) {
    this.r = r;
    this.c = c;
    this.cost = cost;
  }
  @Override
  public int compareTo(Node o) {
    return this.cost - o.cost;
  }
}