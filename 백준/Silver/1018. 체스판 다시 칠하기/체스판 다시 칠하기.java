import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb;
    static char[][] grid;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        grid = new char[N][M];
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            grid[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {
                answer = Math.min(answer, cntColor(i,j));
            }
        }

        sb.append(answer);

        bw.write(sb.toString());
        bw.flush();
    }

    private static int cntColor(int i, int j) {
        int count = 0;

        for (int k = i; k < i + 8; k++) {
            for (int l = j; l < j + 8; l++) {
                char expectedChar = (k+l) % 2 == 0 ? 'W' : 'B';
                if (grid[k][l] != expectedChar){
                    count++;
                }
            }
        }
        // 총 갯수는 같으니 하나의 케이스만 구하고, 반대로 구할 수 있음
        return Math.min(count, 64 - count);
    }
}