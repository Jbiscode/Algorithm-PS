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

    int answer = 0;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      int A = Integer.parseInt(st.nextToken());
      if (A == 1) continue;
      if (A == 2) {
        answer++;
        continue;
      }

      boolean sosu = true;


      for (int j = 2; j < A; j++) {
        if (A % j == 0) {
          sosu = false;
          break;
        }
      }
      if (sosu) answer++;
    }

    sb.append(answer).append("\n");
    bw.write(sb.toString());
    bw.flush();

  }
}
