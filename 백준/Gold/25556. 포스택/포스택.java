import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        boolean available = true;
        String str_tmp;
        String[] str_list;

        Stack<Integer> Stack1 = new Stack<>();
        Stack<Integer> Stack2 = new Stack<>();
        Stack<Integer> Stack3 = new Stack<>();
        Stack<Integer> Stack4 = new Stack<>();

        n = Integer.parseInt(sc.nextLine());
        str_tmp = sc.nextLine();
        str_list = str_tmp.split(" ");

        for (int i = 0; i < str_list.length; i++) {

            if (Stack1.empty() || Stack1.peek() < Integer.parseInt(str_list[i])) {
                Stack1.push(Integer.parseInt(str_list[i]));
            } else if (Stack2.empty() || Stack2.peek() < Integer.parseInt(str_list[i])) {
                Stack2.push(Integer.parseInt(str_list[i]));
            } else if (Stack3.empty() || Stack3.peek() < Integer.parseInt(str_list[i])) {
                Stack3.push(Integer.parseInt(str_list[i]));
            } else if (Stack4.empty() || Stack4.peek() < Integer.parseInt(str_list[i])) {
                Stack4.push(Integer.parseInt(str_list[i]));
            } else {
                available = false;
            }
        }
        if (!available) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }

}

