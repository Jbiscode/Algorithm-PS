import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        String findNum = br.readLine();
        int answer = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i].equals(findNum)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}