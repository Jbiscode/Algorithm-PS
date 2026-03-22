import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb;
    static char[][] grid;
    static int blackCnt, whiteCnt;
    static char[] boardLine;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        grid = new char[N][M];
        blackCnt = 0;
        whiteCnt = 0;
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            boardLine = br.readLine().toCharArray();
            System.arraycopy(boardLine, 0, grid[i], 0, M);
        }

        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {

                for (int k = i; k < i+8; k++) {
                    for (int l = j; l <j+8; l++) {
                        if(k % 2 == 0){
                            if (l % 2 == 0){
                                if (!(grid[k][l] == 'W')){ // 맨처음 화이트시작일때 화이트가아니면 바꿔줘야함
                                    whiteCnt++;
                                }
                                if (!(grid[k][l] == 'B')){ // 맨처음 블랙시작일때 블랙이아니면 바꿔줘야함
                                    blackCnt++;
                                }
                            }else {
                                if (grid[k][l] == 'W'){ // 맨처음 화이트시작일때 옆이 화이트면 바꿔줘야함
                                    whiteCnt++;
                                }
                                if (grid[k][l] == 'B'){ // 맨처음 블랙시작일때 옆이 블랙이면 바꿔줘야함
                                    blackCnt++;
                                }
                            }
                        }else {
                            if (l % 2 == 0){
                                // 화이트시작일때, 두번째줄 시작은 블랙임 화이트면 바꿔줘야함
                                if(grid[k][l] == 'W'){
                                    whiteCnt++;
                                }
                                if(grid[k][l] == 'B'){
                                    blackCnt++;
                                }
                            }else{
                                if(!(grid[k][l] == 'W')){
                                    whiteCnt++;
                                }
                                if(!(grid[k][l] == 'B')){
                                    blackCnt++;
                                }
                            }

                        }
                    }
                }
                int temp = Math.min(whiteCnt, blackCnt);
                answer = Math.min(temp, answer);
                whiteCnt = 0;
                blackCnt = 0;
            }
        }

        sb.append(answer);

        bw.write(sb.toString());
        bw.flush();
    }
}