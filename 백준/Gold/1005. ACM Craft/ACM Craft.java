import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] D = new int[N + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                D[i] = Integer.parseInt(st.nextToken());
            }

            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i <= N; i++) {
                adj.add(new ArrayList<>());
            }

            int[] inDegree = new int[N + 1];
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                adj.get(X).add(Y);
                inDegree[Y]++;
            }

            int W = Integer.parseInt(br.readLine());

            long[] totalTime = new long[N + 1];
            Queue<Integer> queue = new LinkedList<>();

            for (int i = 1; i <= N; i++) {
                if (inDegree[i] == 0) {
                    queue.offer(i);
                    totalTime[i] = D[i];
                }
            }

            while (!queue.isEmpty()) {
                int current = queue.poll();

                for (int next : adj.get(current)) {
                    totalTime[next] = Math.max(totalTime[next], totalTime[current] + D[next]);
                    inDegree[next]--;

                    if (inDegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }

            sb.append(totalTime[W]).append("\n");
        }
        System.out.print(sb.toString());
    }
}