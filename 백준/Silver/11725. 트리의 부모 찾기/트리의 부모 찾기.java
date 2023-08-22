import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] parent;
    static boolean[] isVisit;
    static ArrayList<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        isVisit = new boolean[N + 1];
        list = new ArrayList[N + 1];
        parent = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x);
        }
        dfs(1);
        for (int i = 2; i < N + 1; i++) {
            System.out.println(parent[i]);
        }
    }

    static void dfs(int x) {
        isVisit[x] = true;
        for (int y : list[x]) {
            if (!isVisit[y]) {
                parent[y] = x;
                dfs(y);
            }
        }
    }

}
