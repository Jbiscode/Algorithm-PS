import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  static int minSum, answer;
  static List<List<Integer>> groups;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    
    minSum = 0;
    groups = new ArrayList<>(N);
    int[] lens = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      int len = Integer.parseInt(st.nextToken());
      lens[i] = len;
      groups.add(new ArrayList<>(len));
    }

    for (int i = 0; i < lens.length; i++) {
      List<Integer> group = groups.get(i);

      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < lens[i]; j++) {
        group.add(Integer.parseInt(st.nextToken()));
      }
      group.sort(Comparator.reverseOrder());

    }

    answer = solve(N,M,groups);

    bw.write(answer+"\n");
    bw.flush();
  }
  private static int solve(int N, int M, List<List<Integer>> groups) {
    for (List<Integer> group : groups) {
      minSum += group.get(group.size()-1);
    }

    if (minSum > M) {
      return -1;
    }

    final int IMPOSIBLE = -999999;
    int[] dp = new int[M+1];
    dp[0] = 0;
    for (int w = 1; w <= M; w++) {
      dp[w] = IMPOSIBLE;
    }

    for (List<Integer> group : groups) {
      int[] dp_group = new int[M+1];

      for (int w = 0; w <= M; w++) {
        dp_group[w] = IMPOSIBLE;
      }

      for (Integer v : group) {
        for (int w = M; w >= v; w--) {
          if (dp[w - v] != IMPOSIBLE) {
            dp_group[w] = Math.max(dp_group[w], v + dp[w - v]);
          }

          if (dp_group[w - v] != IMPOSIBLE) {
            dp_group[w] = Math.max(dp_group[w], v + dp_group[w - v]);
          }
        }
      }
      dp = dp_group;
    }

    answer = IMPOSIBLE;

    for (int i = 0; i <= M; i++) {
      answer = Math.max(answer, dp[i]);
    }

    return answer;
  }
}