import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static int answer;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    StringBuilder S = new StringBuilder();
    StringBuilder T = new StringBuilder();
    S.append(br.readLine());
    T.append(br.readLine());

    answer = 0;
    dfs(S, T);

    sb.append(answer).append("\n");
    bw.write(sb.toString());
    bw.flush();
  }

  private static void dfs(StringBuilder S, StringBuilder T) {
    if (T.length() == S.length()) {
      if (S.toString().equals(T.toString())) {
        answer = 1;
      }
      return;
    }

    if (T.length() - 1 > 0){
      if (T.charAt(T.length()-1) == 'A') {
        T.deleteCharAt(T.length()-1);
        dfs(S,T);
        T.append("A");
      }

      if (T.charAt(0) == 'B') {
        T.reverse().deleteCharAt(T.length()-1);
        dfs(S,T);
        T.append("B").reverse();
      }
    }
  }
}


