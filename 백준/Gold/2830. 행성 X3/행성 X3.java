import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] inputs = new int[count];
        int[] isOne = new int[20]; // 2진수 1,000,000 까지
        int tmp = 0;
        long answer = 0L;
        int idx;
        int input;

        for (int i = 0; i < count; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < count; i++) {
            input = inputs[i];
            idx = 0;
            while (input != 0) {
                tmp = input % 2;
                input = input / 2;
                if (tmp == 1) {
                    isOne[idx] ++;      // 자릿수가 1인경우를 체크
                }
                idx++;
            }
        }
        for (int i = 0; i < 20; i++) {
            // 자릿수마다 << i만큼 비트이동 (2배)
            answer += (long) Math.pow(2,i) * isOne[i] * (count - isOne[i]);
        }
        System.out.println(answer);
    }
}