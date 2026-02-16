import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[][] matrix = new int[N+1][N+1];
    int[][][] dp = new int[N+1][N+1][3]; // 오른쪽,대각선,아래
    
    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= N; j++) {
        matrix[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    dp[1][2][0] = 1; // 초기값 설정
    for (int r = 1; r <= N; r++) {
      for (int c = 1; c <= N; c++) {
        // 가로 -> 오른쪽
        if (c<N && matrix[r][c+1] == 0) {
          dp[r][c+1][0] += dp[r][c][0];
        }

        // 가로 -> 대각선
        if (r<N && c<N && matrix[r][c+1]==0 && matrix[r+1][c+1]==0&& matrix[r+1][c]==0) {
          dp[r+1][c+1][1] += dp[r][c][0];
        }

        // 대각선 -> 오른쪽
        if (c<N &&matrix[r][c+1] == 0) {
          dp[r][c+1][0] += dp[r][c][1];
        }
        
        // 대각선 -> 대각선
        if (r<N && c<N && matrix[r][c+1]==0 && matrix[r+1][c+1]==0&& matrix[r+1][c]==0) {
          dp[r+1][c+1][1] += dp[r][c][1];
        }
        
        // 대각선 -> 아래
        if (r<N && matrix[r+1][c] == 0) {
          dp[r+1][c][2] += dp[r][c][1];
        }

        // 아래 -> 아래
        if (r<N && matrix[r+1][c] == 0) {
          dp[r+1][c][2] += dp[r][c][2];
        }
        // 아래 -> 대각선
        if (r<N && c<N && matrix[r][c+1]==0 && matrix[r+1][c+1]==0&& matrix[r+1][c]==0) {
          dp[r+1][c+1][1] += dp[r][c][2];
        }
      }
    }
    sb.append(dp[N][N][0]+dp[N][N][1]+dp[N][N][2]).append("\n");
    bw.write(sb.toString());
    bw.flush();
  }
}
