import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb;
    static int[] T,P,dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        T = new int[N+1];
        P = new int[N+1];
        dp = new int[N+2];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            dp[i+1] = Math.max(dp[i+1],dp[i]);

            int end = i + T[i];

            if (end <= N+1){
                dp[end] = Math.max(dp[end], dp[i]+P[i]);
            }
        }

        sb.append(dp[N+1]).append("\n");
        bw.write(sb.toString());
        bw.flush();
    }
}
