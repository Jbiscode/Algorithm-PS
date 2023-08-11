
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        LinkedList<Integer> arr = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            arr.add(i);
        }
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        while (!arr.isEmpty()) {
            if (arr.size() == 1) {
                sb.append(arr.remove()).append(">");
                break;
            }
            idx = (idx + (K - 1)) % arr.size();
            sb.append(arr.remove(idx)).append(", ");
        }

        System.out.println(sb);
    }
}
