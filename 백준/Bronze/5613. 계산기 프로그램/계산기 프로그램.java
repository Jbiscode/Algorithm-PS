import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status = false;
        int value = sc.nextInt();

        while (!status) {
            String operator = sc.next();
            if (operator.equals("=")){
                status = true;
                break;
            }
            int b = sc.nextInt();

            if (operator.equals("+")) {
                value += b;
            } else if (operator.equals("-")) {
                value -= b;
            } else if (operator.equals("*")) {
                value *= b;
            } else if (operator.equals("/")) {
                value /= b;
            }
        }
        System.out.println(value);
    }
}