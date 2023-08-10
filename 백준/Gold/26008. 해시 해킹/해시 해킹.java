import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        int h = sc.nextInt();

        long x = 1;

        for (int i = 0; i < n - 1; i++) {
            x = (x * m) % 1000000007;
        }
        System.out.println(x);
    }
}
