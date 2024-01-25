import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int[] values = new int[input[0]];

        for (int i = 0; i < input[0]; i++) {
            values[i] = Integer.parseInt(br.readLine());
        }
        long left = 1;
        long right = 0;
        long mid = 0;
        for (int value : values) {
            right = Math.max(right, value);
        }

        long cnt = 0;
        while (left <= right) {
            cnt = 0;
            mid = (left + right) / 2;

            for (long value : values) {
                cnt += value / mid;
            }
            if (cnt < input[1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(right);
    }
}