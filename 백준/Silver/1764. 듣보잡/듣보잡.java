import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> nonHear = new HashSet<>();
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String val = br.readLine();
            nonHear.add(val);
        }
        for (int i = 0; i < M; i++) {
            String val = br.readLine();

            if (nonHear.contains(val)){
                answer.add(val);
            }
        }

        Collections.sort(answer);

        sb.append(answer.size()).append("\n");
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}