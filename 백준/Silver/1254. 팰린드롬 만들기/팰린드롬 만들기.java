import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(calculate(input));

    }

    public static int calculate(String input) {
        int len = input.length();

        for (int i = 0; i < len; i++) {
            if (palinDrome(input.substring(i))) {
                return len + i;
            }
        }
        return 0;
    }

    public static boolean palinDrome(String input) {
        int len = input.length();

        for (int i = 0; i < len; i++) {
            if (input.charAt(i) != input.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    

}