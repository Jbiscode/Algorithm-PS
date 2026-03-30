import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        sb = new StringBuilder();

        String input = br.readLine();

        char[] secret = input.toCharArray();

        int[] dp = new int[secret.length+1];
        dp[0] = dp[1] = 1;

        if (secret[0] == '0'){
            dp[secret.length] = 0;
        }else {
            for (int i = 2; i <= secret.length; i++) {
                int prevV = secret[i-2] - '0';
                int curV = secret[i-1] - '0';

                if (curV == 0){
                    if(prevV == 1 || prevV == 2){
                        dp[i] = dp[i-2];
                    }
                }else{
                    if (prevV == 1 || (prevV == 2 && curV <= 6)){
                        dp[i] = (dp[i-1] + dp[i-2]) % 1000000;
                    }else {
                        dp[i] = dp[i-1];
                    }
                }
            }
        }
        
        sb.append(dp[secret.length]).append("\n");
        bw.write(sb.toString());
        bw.flush();
    }
}
