import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb;
    static int N,Q,Capacity, curPage,used;
    static int[] cap;
    static Deque<Integer> back,front;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());
        Capacity = Integer.parseInt(st.nextToken());

        back = new ArrayDeque<>();
        front = new ArrayDeque<>();

        cap = new int[N+1];
        curPage = -1;
        used = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            cap[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < Q; i++) { // 커맨드를 Q번만큼 반복
            StringTokenizer input = new StringTokenizer(br.readLine());
            runCommand(input);
        }

        sb.append(curPage).append("\n");

        if (!back.isEmpty()){
            while (!back.isEmpty()){
                sb.append(back.pollLast()).append(" ");
            }
        }else {
            sb.append(-1);
        }
        sb.append("\n");

        if (!front.isEmpty()){
            while (!front.isEmpty()){
                sb.append(front.pollLast()).append(" ");
            }
        }else {
            sb.append(-1);
        }
        
        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
    }

    private static void runCommand(StringTokenizer st) {
        String command = st.nextToken();
        if (command.equals("A")){
            int page = Integer.parseInt(st.nextToken());
            for (Integer i : front) used -= cap[i];
            front.clear();

            if (curPage != -1){
                back.addLast(curPage);
            }

            curPage = page;
            used += cap[page];

            while(used > Capacity){
                int oldest = back.pollFirst(); // 맨앞에서 꺼내
                used -= cap[oldest];
            }
        } else if (command.equals("B")) {
            if (!back.isEmpty()){
                front.addLast(curPage);
                curPage = back.pollLast();
            }
        } else if (command.equals("F")) {
            if (!front.isEmpty()){
                back.addLast(curPage);
                curPage = front.pollLast();
            }
        } else if (command.equals("C")) {
            Deque<Integer> temp = new ArrayDeque<>();

            while (!back.isEmpty()){
                int tempPage = back.pollFirst();

                if (!back.isEmpty() && back.peekFirst() == tempPage){
                    used -= cap[tempPage];
                }else {
                    temp.addLast(tempPage);
                }
            }
            back = temp;
        }

    }
}
