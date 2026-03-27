import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb;
    static int list;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        sb = new StringBuilder();

        list = 0;

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            check(st);
        }

        bw.write(sb.toString());
        bw.flush();
    }

    private static void check(StringTokenizer token) {
        String command = token.nextToken();
        int num = -1;
        if (token.hasMoreElements()){
            num = Integer.parseInt(token.nextToken());
        }

        switch (command){
            case "add":
                list |= 1<<num;
                break;
            case "remove":
                list &= ~(1<<num);
                break;
            case "check":
                if ((list & 1<<num) != 0){
                    sb.append(1).append("\n");
                }else {
                    sb.append(0).append("\n");
                }
                break;
            case "toggle":
                list ^= 1<<num;
                break;
            case "all":
                list = (1<<21) - 2;
                break;
            case "empty":
                list = 0;
                break;
        }
    }
}