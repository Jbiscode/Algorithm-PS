import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        solution();
    }
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] inputs = new String[count];
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            inputs[i] = sc.nextLine();
        }
        sc.close();

        for (int i = 0; i < count; i++) {
            Stack<String> stack = new Stack<>();
            int openCnt = 0;
            int closeCnt = 0;
            char[] tmp = inputs[i].toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                stack.push(String.valueOf(tmp[j]));
            }

            String firstOut = stack.peek();

            if (firstOut.equals("(")) {
                System.out.println("NO");
            } else {
                for (int k = 0; k < tmp.length; k++) {
                    String out = stack.pop();
                    if (out.equals(")")) {
                        closeCnt++;
                    } else {
                        openCnt++;
                    }
                    if (closeCnt < openCnt) {
                        break;
                    }
                }
                if (closeCnt != openCnt) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }

        }
    }
}