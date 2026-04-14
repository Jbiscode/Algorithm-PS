import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
  static int N;
  static List<List<Integer>> biggerGraph;  // biggerGraph[i]: i보다 키가 큰 학생 목록 (i -> j)
  static List<List<Integer>> smallerGraph;  // smallerGraph[i]: i보다 키가 작은 학생 목록 (j -> i)

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int T = Integer.parseInt(br.readLine());

    for (int tc = 1; tc <= T; tc++) {
      N = Integer.parseInt(br.readLine());
      int M = Integer.parseInt(br.readLine());

      // 인접 리스트 초기화 (1-indexed)
      biggerGraph = new ArrayList<>(N+1);
      smallerGraph = new ArrayList<>(N+1);
      for (int i = 0; i <= N; i++) {
        biggerGraph.add(i, new ArrayList<>());
        smallerGraph.add(i,new ArrayList<>());
      }

      // 1. 입력으로 그래프 구성
      for (int i = 0; i < M; i++) {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        biggerGraph.get(a).add(b);   // a < b -> a에서 b로
        smallerGraph.get(b).add(a);  // 역방향:  a > b
      }

      // 2. 각 학생 i에 대해 BFS로 도달 가능한 학생 수 계산
      int answer = 0;
      for (int i = 1; i <= N; i++) {
        int bigger = bfs(i, biggerGraph);   // i보다 큰 학생 수
        int smaller = bfs(i, smallerGraph); // i보다 작은 학생 수

        if (bigger + smaller == N - 1) {
          answer++;
        }
      }

      sb.append("#").append(tc).append(" ").append(answer).append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
  }


  private static int bfs(int start, List<List<Integer>> graph) {
    boolean[] visited = new boolean[N + 1];
    Queue<Integer> q = new LinkedList<>();
    q.offer(start);
    visited[start] = true;

    int count = 0;
    while (!q.isEmpty()) {
      int cur = q.poll();
      for (int next : graph.get(cur)) {
        if (!visited[next]) {
          visited[next] = true;
          q.offer(next);
          count++; // 도달한 새 정점마다 카운트 (start 자신 제외)
        }
      }
    }
    return count;
  }
}