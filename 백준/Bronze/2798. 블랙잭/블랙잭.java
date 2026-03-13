import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  static int N, M;
  static int[] cards;
  static int maxSum;

  static void subset(int idx, int cnt, int sum) {
    if ( cnt > 3 || sum > M) return;
    if (cnt == 3 && sum > maxSum && sum <= M) maxSum = sum;
    
    if (idx == N) return;

    subset(idx+1, cnt, sum);
    subset(idx+1, cnt + 1, sum + cards[idx]);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    cards = new int[N];
    maxSum = 0;

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      cards[i] = Integer.parseInt(st.nextToken());
    }

    subset(0, 0, 0);
    sb.append(maxSum).append("\n");
    bw.write(sb.toString());
    bw.flush();
  }
}
