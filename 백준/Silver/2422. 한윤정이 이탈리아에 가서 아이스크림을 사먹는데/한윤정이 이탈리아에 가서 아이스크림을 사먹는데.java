import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    boolean[][] bad = new boolean[N + 1][N + 1];
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      bad[a][b] = bad[b][a] = true;
    }

    int count = 0;
    for (int i = 1; i <= N; i++) {
      for (int j = i + 1; j <= N; j++) {
        if (bad[i][j]) continue;
        for (int k = j + 1; k <= N; k++) {
          if (bad[i][k] || bad[j][k]) continue;
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
